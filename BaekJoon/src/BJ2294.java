import java.util.Arrays;
import java.util.Scanner;

public class BJ2294 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt(); // 3
		int num2 = s.nextInt(); // 15

		int[] numList = new int[num1];
		for (int i = 0; i < numList.length; i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요");
			numList[i] = s.nextInt();
		} 
//			System.out.println(Arrays.toString(numList));
		
		if (num2 % numList[numList.length] == 0) {
			int a = num2 / numList[numList.length];
			System.out.println(a);
		}
	}
}