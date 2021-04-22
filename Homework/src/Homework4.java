//피보나치함수
public class Homework4 {
	public static void main(String[] args) {
		System.out.println(f(10));
	}
	public static int f(int x) {
		if(x<=2) {
			return 1;
		}
		return f(x-1)+f(x-2);
				
	}

}