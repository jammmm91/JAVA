import java.util.Random;

public class 랜덤별 {
	public static void main(String[] args) {
		Random r1 = new Random();
		int randNum = r1.nextInt(5) + 1;
		
		if(randNum == 1) {
			System.out.println("★☆☆☆☆");
		} else if (randNum == 2) {
			System.out.println("★★☆☆☆");
		} else if (randNum == 3) {
			System.out.println("★★★☆☆");
	    } else if (randNum == 4) {
	    	System.out.println("★★★★☆");
	    } else if (randNum == 5) {
	    	System.out.println("★★★★★");
	    }
		
	}
}
