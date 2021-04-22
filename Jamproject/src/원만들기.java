
public class 원만들기 {
	public static void main(String[] args) {
		
		String space = "           ";
		String star = "■■■■■■■■■■■■■";
		for (int i = 0; i < 5; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j ++) {
				star = star + "■";
			} 
			System.out.println(star+space);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j ++) {
				star = star + "■";
			}
			System.out.println(star+space);
		}
	}
}