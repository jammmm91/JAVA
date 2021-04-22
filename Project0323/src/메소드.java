import java.util.Random;

public class 메소드 {  					//메소드를 만들 땐 public class "method_name"으로 생성
	public static void testMethod() {
		Random r = new Random();
		
		int number1 = r.nextInt(100);
		int number2 = r.nextInt(100);
		
		int resultNumber = number1 + number2;
		System.out.println("" + number1 + " + " + number2 + " = " + resultNumber);
	}
	public static void testMethod2() {
		Random r1 = new Random();
		
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		int resultNumber = number1 - number2;
		System.out.println("" + number1 + " - " + number2 + " = " + resultNumber);
	}
	
	public static void main(String[] args) {
		testMethod();
		testMethod2();
	}
}

//import java.util.Random;
//
//public class 메소드 {
//	public void testMethod() {
//		Random r = new Random();
//		
//		int number1 = r.nextInt(100);
//		int number2 = r.nextInt(100);
//		
//		int resultNumber = number1 + number2;
//		System.out.println("" + number1 + " + " + number2 + " = " + resultNumber);
//	}
//	
//	public static void main(String[] args) {
//		메소드 a = new 메소드();
//		a.testMethod();
//	}
//}