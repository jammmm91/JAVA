import java.util.Random;

public class 메소드2 {
	public static void testMethod(int number1, int number2) {
		int resultNumber = number1 + number2;
		System.out.println("" + number1 + " + " + number2 + " = " + resultNumber);
	}
	public static void testMethod2(int number1, int number2) {
		int resultNumber = number1 - number2;
		System.out.println("" + number1 + " - " + number2 + " = " + resultNumber);
	}
	
	public static void main(String[] args) {
		Random r1 = new Random();
		
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		testMethod(number1, number2);
		testMethod2(number1, number2);
	}
}