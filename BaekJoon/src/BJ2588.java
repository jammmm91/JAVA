import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ2588 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userInput1 = s.nextInt();
		int userInput2 = s.nextInt();
		
		String num = String.valueOf(userInput2);
		
		String [] splitNum = num.split("(?<=.)");
		for (int i = 0; i < splitNum.length; i++) {
			System.out.println(userInput1*Integer.parseInt(splitNum[i]));
		}
	}
}
