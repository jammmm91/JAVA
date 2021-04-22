import java.util.Arrays;
import java.util.Random;

public class 배열 {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9};
		int[]arr1 = new int[10];
		
		Random r = new Random();
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = r.nextInt(100);
		}
				
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}

}
