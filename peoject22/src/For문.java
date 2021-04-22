
public class For문 {
	public static void main(String[] args) {
		
		// 내가한거
//		int number1 = 1;
//		for (int i = 1; i < 6; i ++) {
//			int number2 = i * 2;
//		    int resultNumber= number1 * number2;
//		    System.out.println(resultNumber);
//		}
//	}
//}
		
//		// 교수님이한거
//		for (int i = 0; i < 10; i++) {
//			int number = i + 1;
//			
//			if (number % 2 == 0) {
//				System.out.println(number + ":" + "짝수입니다");
//			} else {
//				System.out.println(number);
//			} 	
//		}
//	}
//}
		// 교수님이한거2
		for (int i = 0; i < 10; i++) {
			int number = i + 1;
			
			if (number % 2 == 1) { // 2로 나눠서 나머지가 1이면
				continue;		   // 계속돌리기
			}
			if (number == 6)       // number가 6이면  
				break;			   // 정지
			System.out.println(number);
		}
	}
}