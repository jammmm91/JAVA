package 배열;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;

public class 배열복사 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = a;
		
		b[2] = 19;
//		System.out.println(b);
		
		
		//배열을 복사하고 싶은 때는 특별한 방법을 쓰자!!
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		arr[1] = 10;
		arr1[1] = 20;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}
}