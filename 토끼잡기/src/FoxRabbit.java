import java.io.FileInputStream;
import java.util.Scanner;

public class FoxRabbit {
		static int N;
		static int AnswerN;

		public static void main(String args[]) throws Exception {
			
			System.setIn(new FileInputStream("src\\input.txt"));

			Scanner sc = new Scanner(System.in);

			int T;
			T = sc.nextInt();

			for (int test_case = 1; test_case <= T; test_case++) {
				
				N = sc.nextInt();

				char[] E = sc.nextLine().toCharArray();

				System.out.println("#" + test_case + " " + AnswerN);
			}
		}
	}