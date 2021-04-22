
public class 클래스 {	//클래스
	String name;		//객체변수(or 인스턴스변수,멤버변수,속성)
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		클래스 cat = new 클래스();	//cat 이라는 객체생성
		cat.setName("boby");

		클래스 dog = new 클래스();	//dog 라는 객체생성
		dog.setName("baduk");
		
		System.out.println(cat.name);
		System.out.println(dog.name);
	}

}
