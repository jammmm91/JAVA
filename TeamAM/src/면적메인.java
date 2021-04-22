import java.util.Scanner;

public class 면적메인 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 99999; i++) {

			System.out.println("도형을 정해주십시오.");

			String name = s.nextLine();

			if (name.equals("마름모")) {
				System.out.println("면적을 계산할 도형은 마름모입니다.");
				System.out.println("높이를 입력해주세요.");
				String inputString = scanner.nextLine();
				double height = Double.parseDouble(inputString);
				System.out.println("길이를 입력해주세요.");
				inputString = scanner.nextLine();
				double length = Double.parseDouble(inputString);
				Diamond diamond = new Diamond(name, height, length);
				System.out.println(name + "의 면적은 : ");
				diamond.width();
			} else if (name.equals("삼각형")) {
				System.out.println("면적을 계산할 도형은 삼각형입니다.");
				System.out.println("높이를 입력해주세요.");
				String inputString = scanner.nextLine();
				double height = Double.parseDouble(inputString);
				System.out.println("길이를 입력해주세요.");
				inputString = scanner.nextLine();
				double length = Double.parseDouble(inputString);
				Triangle triangle = new Triangle(name, height, length);
				System.out.println(name + "의 면적은 : ");
				triangle.width();
			} else if (name.equals("원")) {
				Circle circle = new Circle();
				circle.Method();
			} else if (name.equals("평행사변형")) {
				System.out.println("면적을 계산할 도형은 평행사변형입니다.");
				System.out.println("높이를 입력해주세요.");
				String inputString = scanner.nextLine();
				double height = Double.parseDouble(inputString);
				System.out.println("길이를 입력해주세요.");
				inputString = scanner.nextLine();
				double length = Double.parseDouble(inputString);
				Parallelogram parallelogram = new Parallelogram(name, height, length);
				System.out.println(name + "의 면적은 : ");
				parallelogram.width();
			} else if (name.equals("사각형")) {
				System.out.println("면적을 계산할 도형은 사각형입니다.");
				System.out.println("높이를 입력해주세요.");
				String inputString = scanner.nextLine();
				double height = Double.parseDouble(inputString);
				System.out.println("길이를 입력해주세요.");
				inputString = scanner.nextLine();
				double length = Double.parseDouble(inputString);
				Squre squre = new Squre(name, height, length);
				System.out.println(name + "의 면적은 : ");
				squre.width();
			} else if (name.equals("종료")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다\n");
			}
		}
	}
}
