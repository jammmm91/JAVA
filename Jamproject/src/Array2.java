import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 33, 44 }, { 27, 5, 98 } };
		
		int sum1 = 0;
		int sum2 = 0;
		int sum5 = 0;
		int sum6 = 0;
		
		for (int i = 0; i < arr[0].length; i++) {
			sum1 = arr[0][i] + sum1;
			sum2 = arr[1][i] + sum2;
		}
//		System.out.println(sum1 + "," + sum2);
//----------------------------------------------------------------//
		int arr2[][] = new int[2][5];

		for (int i = 0; i < arr2.length; i++) {
			System.arraycopy(arr[i], 0, arr2[i], 0, arr[i].length);
//			System.out.println(Arrays.toString(arr2[i]));
		}
		for(int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length-2; j++) {
				arr2[i][3] = arr2[i][3] + arr2[i][j];
				arr2[i][4] = arr2[i][3] / 3;
		}		
	}
		System.out.println(Arrays.toString(arr2[0]) +" / "+ Arrays.toString(arr2[1]));
	}
	
	
}
//----------------------------------------------------------------//