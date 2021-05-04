package App;

import java.util.Scanner;

// 잔돈 = 500원, 100원, 50원, 10원, 5원, 1원
// 1000원 냈을 때 최소의 갯수로 거슬러 받을 수 있는 동전의 갯수
// 입력 = 상품의가격(1<=입력값<1000)
// ex) 입력이 340이면 660원을 거슬러받고 이때 필요한 동전의 최소갯수는 4

public class Change {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int price = s.nextInt();
		int change = 1000 - price;
		int arr[] = { 500, 100, 50, 10, 5, 1 };
		int count = 0;

		for (int i = 0; i < 6; i++) {
			if (change >= arr[i]) {
				count = count + change / arr[i];
				change = change % arr[i];
			} else if (change == 0) {
				break;
			}
		}
		System.out.println(count);

	}
}