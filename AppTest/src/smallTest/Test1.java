package smallTest;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	static int N;
	static int AnswerN;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src\\inputText.txt"));
		Scanner s = new Scanner(System.in);
		int T;
		T = s.nextInt(); // T = 5
		
		for (int test_case = 1; test_case <= T; test_case++) {
			
			N = s.nextInt();
			
			char[] E = s.nextLine().toCharArray();
			
//			System.out.println(N);
//			System.out.println(E.length);
			
			Stack<String> stack = new Stack<String>();
			
			for (int i = N; i < E.length; i++) {
				if (E[i] == '(') {
					stack.push(String.valueOf(E[i]));
				} System.out.println(stack);
			}
		}
	}
}