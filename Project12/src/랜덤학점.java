import java.util.Random;

public class 랜덤학점 {
	public static void main(String[] args) {
		Random r2 = new Random();
		int randNum = r2.nextInt(101);
		
		
		if(randNum >=90) {
			System.out.println("당신의 학점은 A");
		}else if(randNum >= 80) {
			System.out.println("당신의 학점은 B");
		}else if(randNum >= 70) {
			System.out.println("당신의 학점은 C");
		}else if(randNum >= 60) {
			System.out.println("당신의 학점은 D");
		}else {
			System.out.println("당신의 학점은 E");
		}
	}
}