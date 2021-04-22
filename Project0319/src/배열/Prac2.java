package 배열;

public class Prac2 {
	public static void main(String[] args) {
		int a[] = {0, 0, 0, 0}; //네칸짜리 배열을 만듬
		int b[] = new int[5]; //5칸짜리 배열을 만듬
		
		a[0] = 10;
		a[0]++;
		
		a[1] = 3;
		a[2] = a[0] + a[1];
		
		a[3] = 50;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//int a1 = 0, b = 0, c = 0, d = 0;
	}
}