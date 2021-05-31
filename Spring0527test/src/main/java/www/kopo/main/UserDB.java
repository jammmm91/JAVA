package www.kopo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {
	
//	◆◆◆테이블생성◆◆◆
	public void createTable( ) {
		//open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());
		//use 
			//sqllite = 정수는 INTEGER, 실수는 REAL, 문자열은 TEXT
			String query = "CREATE TABLE staff(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, sex TEXT, address TEXT, department TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		//close
			connection.close();
			
		} catch (Exception e) {
		}
	}
	
//	◆◆◆데이터삽입◆◆◆
	public void insertData(String name, String sex, String address, String department) {
		//open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());
		//use 
			String query = "INSERT INTO staff (name, sex, address, department) VALUES "
							+ "('" + name + "', '" + sex + "', '" + address + "', '" + department + "')";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			
		//close
			connection.close();			
			
		} catch (Exception e) {
		}
	}
	
//	◆◆◆목록보기화면◆◆◆
	public String selectData() {
		String resultString = "";
		try {
		//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());
		//use 
			String query = "SELECT * FROM staff";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String sex = resultSet.getString("sex");
				String address = resultSet.getString("address");
				String department = resultSet.getString("department");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + name + "</td><td>" + sex
						+ "</td><td>" + address + "</td><td>" + department 
						+ "</td><td><a href='update?idx=" + idx + "'>수정하기</a></td>" 
						+ "</td><td><a href='delete?idx=" + idx + "'>삭제하기</a></td>"; 
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
	public Staff detailsData (int idx) {
		Staff resultData = new Staff();
		try {
		//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());
		//use 
			String query = "SELECT * FROM staff WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.sex = resultSet.getString("sex");
				resultData.address = resultSet.getString("address");
				resultData.department = resultSet.getString("department");
		}
			preparedStatement.close();
		//close
			connection.close();			
			
		} catch (Exception e) {
		}
		return resultData;
	}
	
//	◆◆◆데이터수정◆◆◆	
	public void updateData (int idx, String name, String sex, String address, String department) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/staff.db", config.toProperties());			

			String query = "UPDATE staff SET name=?, sex=?, address=?, department=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, sex);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, department);
			preparedStatement.setInt(5, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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