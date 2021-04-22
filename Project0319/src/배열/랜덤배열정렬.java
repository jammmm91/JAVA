package 배열;
import java.util.Arrays;
import java.util.Random;

// 10개의 배열을 만들고 그 배열을 정렬해서 출력

public class 랜덤배열정렬 {
	public static void main(String[] args) {
		int number[] = new int[10];
		//double number[] = {0,0,0,0,0,0,0,0...}; 도 가능
		
		Random r1 = new Random();
		for (int i = 0; i < number.length; i++) {
			number[i] = r1.nextInt(101);
		}
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}
}
