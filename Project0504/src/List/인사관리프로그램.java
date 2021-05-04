package List;

import java.util.ArrayList;
import java.util.Scanner;

public class 인사관리프로그램 {
	public static void main(String[] args) {

		ArrayList<UserInfo> userInfoList = new ArrayList<UserInfo>();

		for (int i = 0; i < 9999; i++) {
			System.out.println();
			System.out.println("인사관리프로그램 v3.2");
			System.out.println("1. 인적사항입력");
			System.out.println("2. 입력이력확인");
			System.out.println("3. 팀별구성원확인");
			System.out.println("4. 정보수정");
			System.out.println("5. 종료");

			Scanner s = new Scanner(System.in);
			String userInput = s.nextLine();

			if (userInput.equals("1")) {
				System.out.println("이름을 입력하세요");
				String userInput1 = s.nextLine();
				System.out.println("부서를 입력하세요");
				String userInput2 = s.nextLine();
				System.out.println("직위를 입력하세요");
				String userInput3 = s.nextLine();
				System.out.println("담당업무를 입력하세요");
				String userInput4 = s.nextLine();

				userInfoList.add(new UserInfo(userInput1, userInput2, userInput3, userInput4));

			} else if (userInput.equals("2")) {
				System.out.println("전체 팀원을 출력합니다");
				for (int j = 0; j < userInfoList.size(); j++) {
					System.out.println((j + 1) + ")" + userInfoList.get(j).name + " / " +
														userInfoList.get(j).department	+ " / " + 
														userInfoList.get(j).position + " / " + 
														userInfoList.get(j).work);
				}
			} else if (userInput.equals("3")) {
				int salesTeam = 0;
				int developmentTeam = 0;
				int personnelTeam = 0;
				int temp = 0;

				for (int k = 0; k < userInfoList.size(); k++) {

					if (userInfoList.get(k).department.contains("영업")) {
						salesTeam++;
					} else if (userInfoList.get(k).department.contains("개발")) {
						developmentTeam++;
					} else if (userInfoList.get(k).department.contains("인사")) {
						personnelTeam++;
					}
				}
				System.out.println("영업팀: " + salesTeam + "명 / " + 
									"개발팀: " + developmentTeam + "명 / " + 
									"인사팀: " + personnelTeam + "명 입니다");
			
			} else if (userInput.equals("4")) {
				System.out.println("수정하실 이름을 입력하세요");
				String targetName = s.nextLine();
				System.out.println("수정하실 분이 속한 부서를 입력하세요");
				String targetDepartment = s.nextLine();

				for (int j = 0; j < userInfoList.size(); j++) {
					if ((targetName.contains(userInfoList.get(j).name)) && (targetDepartment.contains(userInfoList.get(j).department))) {
						System.out.println("수정하실 부분을 알려주세요");
						System.out.println("1. 부서");
						System.out.println("2. 직위");
						System.out.println("3. 담당업무");
						String userInput1 = s.nextLine();
						if (userInput1.equals("1")) {
							System.out.println(userInfoList.get(j).name + "의 부서를 수정합니다");
							System.out.println("변경 부서명을 입력하세요");
							userInfoList.get(j).department = s.nextLine();
						} else if (userInput1.equals("2")) {
							System.out.println(userInfoList.get(j).name + "의 직위를 수정합니다");
							System.out.println("변경 직위를 입력하세요");
							userInfoList.get(j).position = s.nextLine();
						} else if (userInput1.equals("3")) {
							System.out.println(userInfoList.get(j).name + "의 담당업무를 수정합니다");
							System.out.println("변경 담당업무를 입력하세요");
							userInfoList.get(j).work = s.nextLine();
						} else {
							System.out.println("잘못입력하셨습니다");
						}
					} else {
						System.out.println("일치하는 직원이 없습니다");
					}
				}
			} else if (userInput.equals("5")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}