package www.kopo.main;

public class Staff {
	int idx;
	String name;
	String sex;
	String address;
	String department;
	
	Staff() {
		
	}
	
	Staff(String name, String sex, String address, String department) {
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.department = department;
	}
	
	Staff(int idx, String name, String sex, String address, String department) {
		this.idx = idx;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.department = department;
	}
}
