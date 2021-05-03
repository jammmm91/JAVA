import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
	public static void main(String[] args) throws IOException {
		// 입력처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentNum = Integer.parseInt(br.readLine());
		int bus45 = 0;
		int bus25 = 0;

		// 로직구현
		if (studentNum % 25 == 0) {
			bus25 = studentNum / 25;
			System.out.println(bus45 + " " + bus25);
			return; // return을 안쓰면 25로 나누어 떨어져도 밑이 실행된다.
		}
		
		while (true) {
			if (studentNum >= 45) {
				studentNum -= 45;
				bus45++;

				if (studentNum % 25 == 0) {
					bus25 = studentNum / 25;
					System.out.println(bus45 + " " + bus25);
					break;
				}
			} else {
				int A = (studentNum < 25) ? bus25++ : bus45++; // 삼항연산자 이용
				System.out.println(bus45 + " " + bus25);
				break;
			}
		}
	}
}
