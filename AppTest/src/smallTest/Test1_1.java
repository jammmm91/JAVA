package smallTest;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test1_1 {
	public static void main(String[] args) throws Exception {
		int N;
		int AnswerN;

		System.setIn(new FileInputStream("src\\inputText.txt"));
		Scanner s = new Scanner(System.in);
		int T;
		T = s.nextInt(); // T = 5

		for (int test_case = 1; test_case <= T; test_case++) {

			N = s.nextInt();

//			char는 문자를 한글자씩 분리해서 리스트로 저장
//			char[] E = s.nextLine().toCharArray();
			String[] E = s.nextLine().split("");

			// E에 제대로 들어갔는지 확인
//			System.out.println(Arrays.toString(E));

			int cnt = 1;
			int index = 0;
			if (E[N].equals("(")) {
				for (int i = N + 1; i < E.length; i++) {
					if (E[i].equals("(")) {
						cnt++;
					} else if (E[i].equals(")")) {
						cnt--;
						if (cnt == 0) {
							index = i;
							break;
						}
					}
				}
			} 
//			else {
//				System.out.println("0");
//			}
			System.out.println(index);
		}
	}
}
