package com.kopo.login;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

import com.kopo.login.Member;

public class UserDB {
	
	// 테이블 생성
	public boolean createDB() { 
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/user.db", config.toProperties());
			// use
			String query = "CREATE TABLE memo(idx INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, content TEXT, created TEXT, updated TEXT, userIdx INTEGER)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);

			String query2 = "CREATE TABLE users(idx INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, pwd TEXT, name TEXT, birthday TEXT, address TEXT, created TEXT, updated TEXT)";
			Statement statement2 = connection.createStatement();
			int result2 = statement2.executeUpdate(query2);
			
			
			statement.close();
			statement2.close();
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// 회원정보 삽입
	public boolean insertDB(Member member) { 
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			// 아이디 중복 여부 검사
			String query1 = "SELECT * FROM users WHERE id=?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement1.setString(1, member.id);
			ResultSet resultSet = preparedStatement1.executeQuery();
			if (resultSet.next()) {
				preparedStatement1.close();
				connection.close();
				return false;
			}
			preparedStatement1.close();			
			
			// password hash sha256 -> 주로사용
			member.pwd = sha256(member.pwd);

			String query = "INSERT INTO users (id, pwd, name, birthday, address, created, updated) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, member.id);
			preparedStatement.setString(2, member.pwd);
			preparedStatement.setString(3, member.name);
			preparedStatement.setString(4, member.birthday);
			preparedStatement.setString(5, member.address);
			preparedStatement.setString(6, member.created);
			preparedStatement.setString(7, member.updated);
			int result = preparedStatement.executeUpdate();

			if (result < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			}
			preparedStatement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean insertMemo(Memo memo) { 
		// open
				try {
					Class.forName("org.sqlite.JDBC");
					SQLiteConfig config = new SQLiteConfig();
					Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/user.db",
							config.toProperties());

					String fieldString = "title, content, created, updated, userIdx";
					String query = "INSERT INTO memo (" + fieldString + ") VALUES (?, ?, ?, ?, ?);";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, memo.title);
					preparedStatement.setString(2, memo.content);
					preparedStatement.setString(3, memo.created);
					preparedStatement.setString(4, memo.updated);
					preparedStatement.setInt(5, memo.userIdx);

					int finalResult = preparedStatement.executeUpdate();

					if (finalResult < 1) {
						preparedStatement.close();
						connection.close();
						return false;
					}
					preparedStatement.close();
					connection.close();
					return true;
					// close
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}

//	로그인
//	public boolean loginDB(String id, String pwd) { 
//		try {
//			Class.forName("org.sqlite.JDBC");
//			SQLiteConfig config = new SQLiteConfig();
//			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());
//
//			// password hash sha256 -> 주로사용
//			pwd = this.sha256(pwd);
//			
//			String query = "SELECT * FROM users WHERE id=? AND pwd=?";
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, id);
//			preparedStatement.setString(2, pwd);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			if (resultSet.next()) {
//				preparedStatement.close();
//				connection.close();
//				return true;
//			} else {
//				preparedStatement.close();
//				connection.close();
//				return false;
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//		
//	}

	// 로그인
	public int loginDB2(String id, String pwd) { 
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			pwd = this.sha256(pwd);// password hash sha256 -> 주로사용
			
			String query = "SELECT * FROM users WHERE id=? AND pwd=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				preparedStatement.close();
				connection.close();
				return idx;
			} else {
				preparedStatement.close();
				connection.close();
				return -1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	
	// 회원정보 전체조회
	public String selectData() { 
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			String query = "SELECT * FROM users";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String pwd = resultSet.getString("pwd");
				String name = resultSet.getString("name");
				String birthday = resultSet.getString("birthday");
				String address = resultSet.getString("address");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");

				resultString = resultString + "<tr>" 
						+ "<td>" + idx + "</td>" 
						+ "<td>" + id + "</td>" 
						+ "<td>" + name + "</td>" 
						+ "<td>" + birthday + "</td>" 
						+ "<td>" + address + "</td>"
						+ "<td>" + created + "</td>" 
						+ "<td>" + updated + "</td>" 
						+ "<td><a href='delete?idx=" + idx + "'>삭제하기</a></td>" + "</tr>";
	
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
	// 특정회원 조회
	public Member detailsData(int idx) { 
		Member resultData = new Member();
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			String query = "SELECT * FROM users WHERE idx=?";
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
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
		}
		return resultData;
	}
	
//	특정회원 메모 조회
	public String detailsMemo(int idx1) { 
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			String query = "SELECT * FROM memo WHERE userIdx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");

				resultString = resultString + "<tr>" 
						+ "<td>" + idx + "</td>" 
						+ "<td>" + title + "</td>" 
						+ "<td>" + content + "</td>" 
						+ "<td>" + created + "</td>" 
						+ "<td>" + updated + "</td>" 
						+ "<td><a href='updatememo?idx=" + idx + "'>수정하기</a></td>"
						+ "<td><a href='delete?idx=" + idx + "'>삭제하기</a></td>" + "</tr>";
	
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
//	public Member detailsDataWithId(String id) { // 특정회원 조회
//		Member resultData = new Member();
//		try {
//			Class.forName("org.sqlite.JDBC");
//			SQLiteConfig config = new SQLiteConfig();
//			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());
//
//			String query = "SELECT * FROM users WHERE id=?";
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, id);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			if (resultSet.next()) {
//				resultData.idx = resultSet.getInt("idx");
//				resultData.id = resultSet.getString("id");
//				resultData.pwd = resultSet.getString("pwd");
//				resultData.name = resultSet.getString("name");
//				resultData.birthday = resultSet.getString("birthday");
//				resultData.address = resultSet.getString("address");
//				resultData.created = resultSet.getString("created");
//				resultData.updated = resultSet.getString("updated");
//			}
//			preparedStatement.close();
//			connection.close();
//		} catch (Exception e) {
//		}
//		return resultData;
//	}


	// 수정을 위한 검증 
	public int verificationData(String id, String password) {
		int returnIdx = -1 ;
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db",config.toProperties());
			
			String pwd = sha256(password);
			System.out.println(pwd);
			String query = "SELECT * FROM users WHERE id=? and pwd = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				returnIdx = resultSet.getInt("idx");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnIdx;
	}
	

//	public boolean updateData(String id, String pwd, String name, String address, String updated) { // 회원정보 갱신
//		try {
//			Class.forName("org.sqlite.JDBC");
//			SQLiteConfig config = new SQLiteConfig();
//			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db",
//					config.toProperties());
//
//			String query = "UPDATE users SET pwd=?,name=?,address=?,updated=? WHERE id=?";
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			String hasPwd = sha256(pwd);
//			
//			preparedStatement.setString(1, hasPwd); // pwd..
//			preparedStatement.setString(2, name);
//			preparedStatement.setString(3, address);
//			preparedStatement.setString(4, updated);
//			preparedStatement.setString(5, id);
//
//			int result = preparedStatement.executeUpdate();
//			preparedStatement.close();
//			connection.close();
//			if (result == 1) {
//				preparedStatement.close();
//				connection.close();
//				return true;
//			} else {
//				preparedStatement.close();
//				connection.close();
//				return false;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	public boolean updateData2(int idx, String pwd, String name, String address, String updated) { // 회원정보 갱신
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db",
					config.toProperties());

			String query = "UPDATE users SET name=?,pwd=?,address=?,updated=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			String hasPwd = sha256(pwd);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, hasPwd);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, updated);
			preparedStatement.setInt(5, idx);

			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			if (result == 1) {
				preparedStatement.close();
				connection.close();
				return true;
			} else {
				preparedStatement.close();
				connection.close();
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// 회원정보 삭제
	public boolean deleteData(int idx) { 
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db",config.toProperties());
			String query = "DELETE FROM users WHERE idx=? ";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			int result = preparedStatement.executeUpdate();

			preparedStatement.close();
			connection.close();
			if (result == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 회원정보 검색
	public String searchData(String InputId) { 
		Member resultData = new Member();
		String resultString = "";
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db",
					config.toProperties());
			String query = "SELECT * FROM users WHERE name=?";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, InputId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String pwd = resultSet.getString("pwd");
				String name = resultSet.getString("name");
				String birthday = resultSet.getString("birthday");
				String address = resultSet.getString("address");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");

				resultString = resultString + "<tr>" 
						+ "<td>" + idx + "</td>" 
						+ "<td>" + id + "</td>" 
						+ "<td>" + pwd + "</td>" 
						+ "<td>" + name + "</td>" 
						+ "<td>" + birthday + "</td>" 
						+ "<td>" + address + "</td>"
						+ "<td>" + created + "</td>" 
						+ "<td>" + updated + "</td>" 
						+ "<td><a href='delete?idx=" + idx + "'>삭제하기</a></td>" + "</tr>";
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}

	// 비밀번호 암호화
	public String sha256(String msg) { 
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(msg.getBytes());

			StringBuilder builder = new StringBuilder();
			for (byte b : md.digest()) {
				builder.append(String.format("%02x", b));
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	// 특정회원 조회
	public Member searchDetails(String id, String pwd) { 
		Member resultData = new Member();
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\user.db", config.toProperties());

			String query = "SELECT * FROM users WHERE id=? AND pwd=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.id = resultSet.getString("id");
				resultData.pwd = resultSet.getString("pwd");
				resultData.name = resultSet.getString("name");
				resultData.birthday = resultSet.getString("birthday");
				resultData.address = resultSet.getString("address");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
				}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
		}
		
		return resultData;
	}
}