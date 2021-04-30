import java.util.Scanner;

public class 단어뒤집기 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String userInput = s.nextLine();

		StringBuffer c = new StringBuffer(userInput);
		String reverseInput = c.reverse().toString();
		
		System.out.println(reverseInput);
	}
}