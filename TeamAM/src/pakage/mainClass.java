package pakage;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		parallelogram triangle = new parallelogram("평행사변형");

		baseMethod[] poligon = {new parallelogram("평행사변형") };

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < poligon.length; i++) {
			System.out.println("면적을 구할 도형을 입력해주세요.\n삼각형/사각형/원/평행사변형/마름모 " + "\n(종료를 원하시면 '종료'를 입력하세요)");
			String input = s.nextLine();
//         if (input.equals("마름모")) {
//            figure[0].input();
//            figure[0].printConsole();
//            System.out.println();
//         }else if (input.equals("삼각형")) {
//            figure[1].input();
//            figure[1].printConsole();
//            System.out.println();
//         }else if (input.equals("원")) {
//            figure[2].input();
//            figure[2].printConsole();
//            System.out.println();
//         }else if (input.equals("사각형")) {
//            figure[3].input();
//            figure[3].printConsole();
//            System.out.println();
			if (input.equals("평행사변형")) {
				poligon[0].input();
				poligon[0].printConsole();
				System.out.println();
			} else if (input.equals("종료")) {
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

}