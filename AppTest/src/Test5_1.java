import java.util.Scanner;

public class Test5_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("탑승하는 전체 학생의 인원을 입력하세요");
		int studentNum = s.nextInt();
		int bus25 = 0;
		int bus45 = 0;

		if (bus25 % 25 == 0) {
			bus25 = studentNum / 25;
			System.out.println(studentNum + " : " + bus25 + " " + bus45);
			return;
		}
		while (true) {
			if (studentNum >= 45) {
				studentNum = studentNum - 45;
				bus45++;

				if (studentNum % 25 == 0) {
					bus25 = studentNum / 25;
					System.out.println(studentNum + " : " + bus25 + " " + bus45);
					break;
				}
			} else {
				int a = (studentNum > 25) ? bus25++ : bus45++;
				System.out.println(bus25 + " " + bus45);
				break;
			}
		}
	}
}