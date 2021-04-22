public class Student {
	String name;
	String address;
	String phone;
	int age;

	Student(String name, String address, String phone, int age) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	}
//
//	public void printInfo() {
//		System.out.println("이름:" + this.name + " / 주소:" + this.address + " / 연락처:" + this.phone + " / 나이:" + this.age);
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getname() {
//		return this.name;
//	}
	
	public String toString() {
		return "이름:" + this.name + " / 주소:" + this.address + " / 연락처:" + this.phone + " / 나이:" + this.age;
	}
}