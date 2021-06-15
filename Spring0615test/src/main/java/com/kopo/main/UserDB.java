package com.kopo.main;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {
	
	// 테이블 생성
	public boolean createDB() { 
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/residentInfo.db", config.toProperties());
			// use
			String query = "CREATE TABLE resident(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, age TEXT, sex TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);

			String query2 = "CREATE TABLE apartment(idx INTEGER PRIMARY KEY AUTOINCREMENT, apt_name TEXT)";
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

	// 주민정보삽입
	public boolean insertDB(Resident member) { 
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

			String query1 = "SELECT * FROM resident WHERE name=?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement1.setString(1, member.name);
			ResultSet resultSet = preparedStatement1.executeQuery();
			if (resultSet.next()) {
				preparedStatement1.close();
				connection.close();
				return false;
			}
			preparedStatement1.close();			

			String query = "INSERT INTO resident (name, age, sex) VALUES (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, member.name);
			preparedStatement.setString(2, member.age);
			preparedStatement.setString(3, member.sex);
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
	
	// 주민정보전체조회
		public String selectData() { 
			String resultString = "";
			try {
				// open
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

				String query = "SELECT * FROM resident";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					int idx = resultSet.getInt("idx");
					String name = resultSet.getString("name");
					String age = resultSet.getString("age");
					String sex = resultSet.getString("sex");

					resultString = resultString + "<tr>" 
							+ "<td>" + idx + "</td>" 
							+ "<td>" + name + "</td>" 
							+ "<td>" + age + "</td>" 
							+ "<td>" + sex + "</td>" 
							+ "<td><a href='update?idx=" + idx + "'>✔</a></td>"
							+ "<td><a href='delete?idx=" + idx + "'>✔</a></td>" + "</tr>";
		
				}
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resultString;
		}
		
//		주민정보수정
		public boolean updateData(int idx, String name, String age, String sex) {
			try {
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db",
						config.toProperties());

				String query = "UPDATE resident SET name=?,age=?,sex=? WHERE idx=?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
								
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, age);
				preparedStatement.setString(3, sex);
				preparedStatement.setInt(4, idx);

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
		
		public Resident detailsData(int idx) { 
			Resident resultData = new Resident();
			try {
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

				String query = "SELECT * FROM resident WHERE idx=?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, idx);
				ResultSet resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					resultData.idx = resultSet.getInt("idx");
					resultData.name = resultSet.getString("name");
					resultData.age = resultSet.getString("age");
					resultData.sex = resultSet.getString("sex");
				}
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
			}
			return resultData;
		}
		
		// 입주자정보삭제
		public boolean deleteData(int idx) { 
			try {
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db",config.toProperties());
				String query = "DELETE FROM resident WHERE idx=? ";

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
		
		public Resident totalMember() { 
			Resident resultData = new Resident();
			try {
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

				String query = "select count(*) from resident";				
				
			} catch (Exception e) {
			}
			return resultData;
		}
		
		public boolean insertApt(Apartment apt) { 
			try {
				Class.forName("org.sqlite.JDBC");
				SQLiteConfig config = new SQLiteConfig();
				Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

				String query = "INSERT INTO apartment (apt_name) VALUES (?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, apt.name);
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
}
