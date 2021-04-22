
public class 연습 {
	
	
	
	public 연습(){
		System.out.println("생성자 호출 성공");
	}
	
	public 연습(String a, int num) {
		System.out.println(a + "-" +num + " 생성자 호출 성공");
	}
	
	public static void main(String[] args) {
		연습 practice = new 연습();
		연습 practice2 = new 연습("김재민", 91);
	}

}