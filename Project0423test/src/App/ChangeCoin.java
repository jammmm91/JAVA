package App;

import java.util.Scanner;

// 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다.
// 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다.
// 동전의 개수가 최소가 되도록 거슬러 주어야 한다.
// 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 
// 알려주는 프로그램을 작성하시오.

public class ChangeCoin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int coin = s.nextInt();

		int cnt = 0;

		while (coin > 0) {
			if (coin % 5 == 0) {
				cnt = cnt + (coin / 5);
				break;
			}
			coin = coin - 2;
			cnt++;
		}
		if (coin < 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}
}
