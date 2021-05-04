package TestSolve;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<People> people = new ArrayList<People>();
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1 : 유권자 정보 입력");
			System.out.println("2 : 입력받은 전체 유권자 출력");
			System.out.println("3 : 기본 통계 출력");
			System.out.println("4 : 선호 정당 입력");
			System.out.println("5 : 선호 정당 통계 출력");
			System.out.println("quit : 종료");

			String userInputString = scanner.nextLine();
			if (userInputString.equals("1")) {
				People p1 = new People();
				p1.inputData();
				people.add(p1);
			} else if (userInputString.equals("2")) {
				for (int j = 0; j < people.size(); j++) {
					System.out.println(people.get(j));
				}
			} else if (userInputString.equals("3")) {
				System.out.println("전체 유권자 수 : " + people.size());
				int totalAge = 0;
				for (int j = 0; j < people.size(); j++) {
					totalAge = totalAge + people.get(j).age;
				}
				System.out.println("유권자 평균 나이 : " + (totalAge / (double) people.size()));
				int total20 = 0;
				int total30 = 0;
				int total40 = 0;
				int total50 = 0;
				for (int j = 0; j < people.size(); j++) {
					if (people.get(j).age >= 20 && people.get(j).age < 30) {
						total20++;
					} else if (people.get(j).age >= 30 && people.get(j).age < 40) { // 30대 카운팅
						total30++;
					} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
						total40++;
					} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
						total50++;
					}
				}
				System.out.println("20대 유권자 수 : " + total20);
				System.out.println("30대 유권자 수 : " + total30);
				System.out.println("40대 유권자 수 : " + total40);
				System.out.println("50대 유권자 수 : " + total50);
			} else if (userInputString.equals("4")) {
				System.out.println("선호 정당을 입력할 사람의 이름을 입력하세요");
				String inputName = scanner.nextLine();
				System.out.println("선호 정당을 입력할 사람의 나이를 입력하세요");
				String inputAgeString = scanner.nextLine();
				int inputAge = Integer.parseInt(inputAgeString);

				int selectPeople = -1;
				for (int j = 0; j < people.size(); j++) {
					if (inputName.equals(people.get(j).name) && inputAge == people.get(j).age) {
						selectPeople = j;
						break;
					}
				}
				if (selectPeople < 0) {
					System.out.println("입력하신 정보에 해당되는 사람이 없습니다.");
				} else {
					People selected = people.get(selectPeople);
					System.out.println("선호 정당을 입력해주세요. (A, B, C 중 입력)");
					selected.favoriteParty = scanner.nextLine();
				}
			} else if (userInputString.equals("5")) {
				int inputFavoritePartyCount = 0;
				for (int j = 0; j < people.size(); j++) {
					if (!people.get(j).favoriteParty.equals("")) {
						inputFavoritePartyCount++;
					}
				}
				double percentFavoriteParty = inputFavoritePartyCount / (double) people.size() * 100;
				System.out.println("전체 유권자 수 : " + people.size());
				System.out.println("선호 정당을 입력한 사람의 수 : " + inputFavoritePartyCount);
				System.out.println("전체 유권자 대비 선호 정당을 입력한 사람의 비율 : " + percentFavoriteParty + "%");

				Party aParty = new Party("A");
				Party bParty = new Party("B");
				Party cParty = new Party("C");

				for (int j = 0; j < people.size(); j++) {
					if (people.get(j).favoriteParty.equals("A")) {
						aParty.favoritePeopleCount++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							aParty.favorite20count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) { // 30대 카운팅
							aParty.favorite30count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							aParty.favorite40count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							aParty.favorite50count++;
						}
						if (people.get(j).address.contains("서울")) {
							aParty.seoulCount++;
						} else if (people.get(j).address.contains("경기")) {
							aParty.gyeongGiCount++;
						} else if (people.get(j).address.contains("부산")) {
							aParty.busanCount++;
						} else if (people.get(j).address.contains("제주")) {
							aParty.jejuCount++;
						}
					} else if (people.get(j).favoriteParty.equals("B")) {
						bParty.favoritePeopleCount++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							bParty.favorite20count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) { // 30대 카운팅
							bParty.favorite30count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							bParty.favorite40count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							bParty.favorite50count++;
						}
						if (people.get(j).address.contains("서울")) {
							bParty.seoulCount++;
						} else if (people.get(j).address.contains("경기")) {
							bParty.gyeongGiCount++;
						} else if (people.get(j).address.contains("부산")) {
							bParty.busanCount++;
						} else if (people.get(j).address.contains("제주")) {
							bParty.jejuCount++;
						}
					} else if (people.get(j).favoriteParty.equals("C")) {
						cParty.favoritePeopleCount++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							cParty.favorite20count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) { // 30대 카운팅
							cParty.favorite30count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							cParty.favorite40count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							cParty.favorite50count++;
						}
						if (people.get(j).address.contains("서울")) {
							cParty.seoulCount++;
						} else if (people.get(j).address.contains("경기")) {
							cParty.gyeongGiCount++;
						} else if (people.get(j).address.contains("부산")) {
							cParty.busanCount++;
						} else if (people.get(j).address.contains("제주")) {
							cParty.jejuCount++;
						}
					}
				}
				System.out.println(aParty);
				System.out.println(bParty);
				System.out.println(cParty);
			} else if (userInputString.equals("quit")) {
				break;
			}
		}
	}
}
