public class Runclass {
	public static void main(String[] args) {
		int a;                           // 정수
		a = 10;
		
		double c = 3.14;                 // 실수
		char d = 'A';                    // 문자(한글자) 작은따옴표 사용(오직 여기서만)
		boolean e = true;                // 참,거짓 tlue,false
		String f = "Hello";              // 문자열 큰따옴표 사용
//		String f = new String("Hello");  // 원래는 이렇게 사용해야 하지만 문자는 윗줄처럼 이용가능
		
		int b = a + 3;
		double result = 10.0 / 3;        // = 가 나오면 = 뒤에 값이 앞으로 들어간다고 생각하면 됨
		System.out.println(result);	
		
//		String printString = "안녕하세요.\n \"자바"프로그래밍 수업입니다.";
//		System.out.println(printString);
	}
}