import iava.util.Arrays;
import iava.util.Iterator;

public class Array {
	public static void main(String[] args) {
		int arr[][] = { { 10, 33, 44 }, { 27, 5, 98 } };
		String arr1[] = { "Name", "Quiz1", "Quiz2", "Quiz3", "Sum", "Avg" };

		int sum1 = arr[0][0]+arr[0][1]+arr[0][2];
		int sum2 = arr[1][0]+arr[1][1]+arr[1][2];
		
		int tot = arr[0][0]+arr[1][0];
		int tot1 = arr[0][1]+arr[1][1];
		int tot2 = arr[0][2]+arr[1][2];

		double avg1 = (double)sum1 / 3;
		double avg2 = (double)sum2 / 3;
		avg2 = (double)Math.round(avg2 * 10) / 10; 
		
		
		System.out.println(arr1[0] +"     "+ arr1[1] +" "+ arr1[2] +" "+ arr1[3] +" "+ arr1[4] +" "+ arr1[5]);
		System.out.println("----------------------------------");
		System.out.println("Student1  " + arr[0][0] +"     "+ arr[0][1] + "    " + arr[0][2] +"   "+ sum1 +" "+ avg1);
		System.out.println("Student2  " + arr[1][0] +"     "+ arr[1][1] + "     " + arr[1][2] +"  "+ sum2+" "+ avg2);
		System.out.println("----------------------------------");
		System.out.println("tot       " + tot + "    " + tot1 + "    " + tot2);
	}
}