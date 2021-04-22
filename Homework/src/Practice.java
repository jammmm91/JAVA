import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		
		int number[] = new int[10]; 
		
		Random r = new Random();
		
		int randNum = r.nextInt(10)+1;
		
		System.out.println(randNum);
	} 
}