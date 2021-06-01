package www.kopo.main;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {
	
//	◆◆◆테이블생성◆◆◆
	public boolean createDB() {
		boolean isSuccess = false;
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE user(idx INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, pwd TEXT, name TEXT, birthday TEXT, address TEXT, created TEXT, updated TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			if (result == 1) {
				isSuccess = true;
			}
			statement.close();
			// close
			connection.close();

		} catch (Exception e) {
			// catch문 잡을때 기본적으로 넣는다고 생각한다 (에러출력)
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
//	◆◆◆데이터삽입◆◆◆
	public boolean insertDB(User user) {
		//open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db", config.toProperties());
		//use 
//			String query = "INSERT INTO user (id, pwd, name, birthday, address, created, updated) VALUES "
//					+ "('"
//					+ user.id + "', '"
//					+ user.pwd + "', '"
//					+ user.name + "', '"
//					+ user.birthday + "', '"
//					+ user.address + "', '"
//					+ user.created + "', '"
//					+ user.updated + "'"
//					+ ")";
//			
//			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate(query);
			
			user.pwd = sha256(user.pwd);
			
			String query = "INSERT INTO user (id, pwd, name, birthday, address, created, updated)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.id);
			preparedStatement.setString(2, user.pwd);
			preparedStatement.setString(3, user.name);
			preparedStatement.setString(4, user.birthday);
			preparedStatement.setString(5, user.address);
			preparedStatement.setString(6, user.created);
			preparedStatement.setString(7, user.updated);
			int result = preparedStatement.executeUpdate();
			
			if (result < 1) {
				return false;
			}
			preparedStatement.close();			
			
			// close
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// SHA256 해싱 코드
	public String sha256(String msg) {
		try {
		    MessageDigest md = MessageDigest.getInstance("SHA-256");
		    md.update(msg.getBytes());
		    
		    StringBuilder builder = new StringBuilder();
		    for (byte b: md.digest()) {
		      builder.append(String.format("%02x", b));
		    }
		    return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	
//	◆◆◆목록보기화면◆◆◆
	public String selectDB() {
		String resultString = "";
		try {
		//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db", config.toProperties());
		//use 
			String query = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				String birthday = resultSet.getString("birthday");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + id + "</td><td>" + name
						+ "</td><td>" + birthday + "</td><td><a href='update?idx=" + idx + "'>CLICK</a></td>";
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();
			
		//close
			connection.close();			
			
		} catch (Exception e) {
		}
		return resultString;
	}
	
//	◆◆◆목록확인◆◆◆
	public User detailsDB (int idx) {
		User resultData = new User();
		try {
		//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db", config.toProperties());
		//use 
			String query = "SELECT * FROM user WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.id = resultSet.getString("id");
				resultData.pwd = resultSet.getString("pwd");
				resultData.name = resultSet.getString("name");
				resultData.birthday = resultSet.getString("birthday");
				resultData.address = resultSet.getString("address");
		}
			preparedStatement.close();
		//close
			connection.close();			
			
		} catch (Exception e) {
		}
		return resultData;
	}
	
//	◆◆◆데이터수정◆◆◆	
//	public boolean updateDB (User user) {
		public void updateDB (int idx, String id, String pwd, String name, String birthday, String address) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db", config.toProperties());			

			String query = "UPDATE user SET id=?, pwd=?, name=?, birthday=?, address=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			preparedStatement.setString(3, name);
			preparedStatement.setString(4, birthday);
			preparedStatement.setString(5, address);
			preparedStatement.setInt(6, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//			user.pwd = sha256(user.pwd);
//			
//			String query = "UPDATE user SET(id, pwd, name, birthday, address, updated)"
//					+ "VALUES (?, ?, ?, ?, ?, ?)";
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, user.id);
//			preparedStatement.setString(2, user.pwd);
//			preparedStatement.setString(3, user.name);
//			preparedStatement.setString(4, user.birthday);
//			preparedStatement.setString(5, user.address);
//			preparedStatement.setString(6, user.updated);
//			int result = preparedStatement.executeUpdate();
//			
//			if (result < 1) {
//				return false;
//			}
//			preparedStatement.close();			
//			
//			// close
//			connection.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	return true;
//}
	
//	◆◆◆데이터삭제◆◆◆
	public void deleteData (int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());			

			String query = "DELETE FROM staff WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	◆◆◆데이터검색◆◆◆
	public String searchData(String name) {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db",	config.toProperties());
			// use
			String query = "SELECT*FROM staff WHERE name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet);
			if (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String sex = resultSet.getString("sex");
				String address = resultSet.getString("address");
				String department = resultSet.getString("department");
				
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + name + "</td><td>" + sex
						+ "</td><td>" + address + "</td><td>" + department 
						+ "</td><td><a href='update?idx=" + idx + "'>수정하기</a></td>" 
						+ "</td><td><a href='delete?idx=" + idx + "'>삭제하기</a></td>"; 
				resultString = resultString + "</tr>";

				resultString = resultString + "</tr>";

			}

			preparedStatement.close();
			// close
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultString;
	}
}