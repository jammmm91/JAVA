
public class 산술연산자 {
	public static void main(String[] args) {
		int a = 10;
		double b = a;
		int c = (int)b;
		
		int num1 = 10;
		int num2 = 2;
		Double result = (Double)num1 / num2; //나눗셈 할때는 Double로 캐스팅
		
		short s1 = 10;
		int s2 = s1;
		short s3 = s2;
		
		int plus = 10 + a;               //더하기       ┐
		int minus = 100 - c;             //빼기        
		int multi = 3 * 20;              //곱하기       │ 일반연산자
		Double divide = (Double)10 / 3;  //나누기       
		int number3 = 10 % 3;            //나머지       ┘
		
		a++;  // a = a + 1                            ┐
		c--;  // c = c - 1                            ┘ 증감연산자 
	 
	}
}