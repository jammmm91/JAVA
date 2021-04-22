package 배열;
//  ##1-100까지의 숫자중에 소수찾기##
public class 소수찾기 {
	public static void main(String[] args) {
		for (int j =0; j < 100; j++) {
			int number = j + 1;
			if (number < 2) {
				continue;
			}
		
			boolean isPrime = true;
			for (int i = 0; i < number; i++) {
				if (i < 2) {
				continue;
				
				}
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
	
			if (isPrime) {
				System.out.println("" + number + "is Prime");  
			} else {
//				System.out.println("" + number + "is  not Prime");
			}
		}
	}
}