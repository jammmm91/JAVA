
public class 저금통1 {
	int coins = 0;
	public void deposit(int coin) {  //돈을 넣는것
		coins = coins + coin;
	}
	public void withdraw() {  //모든 돈을 찾는것(현재는 인출이 안되니 화면에 출력하는 걸로 구현)
		System.out.println("시스템을 종료합니다\n" +"총 입금 금액은 : " + coins + "원 입니다 :)");
	}
}
