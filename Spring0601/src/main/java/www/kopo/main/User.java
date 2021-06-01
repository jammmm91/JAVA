package www.kopo.main;

public class User {
	int idx;
	String id;
	String pwd;
	String name;
	String birthday;
	String address;
	String created;
	String updated;
	
	User() {
		
	}
	
	User(String id, String pwd, String name, String birthday, String address, String updated) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.updated = updated;
	}	
	
	User(String id, String pwd, String name, String birthday, String address, String created, String updated) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.created = created;
		this.updated = updated;
	}
	
	User(int idx, String id, String pwd, String name, String birthday, String address, String created, String updated) {
		this.idx = idx;
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.created = created;
		this.updated = updated;
	}
}
