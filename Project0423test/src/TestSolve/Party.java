package TestSolve;

public class Party {
	String name;
	int favoritePeopleCount = 0;
	int favorite20count = 0;
	int favorite30count = 0;
	int favorite40count = 0;
	int favorite50count = 0;
	int seoulCount = 0;
	int gyeongGiCount = 0;
	int busanCount = 0;
	int jejuCount = 0;
	
	Party(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String printString = this.name + "당\n"
				+ "선호하는 유권자 수 : " + this.favoritePeopleCount + "\n"
				+ "선호하는 유권자 수(20대) : " + this.favorite20count + "\n"
				+ "선호하는 유권자 수(30대) : " + this.favorite30count + "\n"
				+ "선호하는 유권자 수(40대) : " + this.favorite40count + "\n"
				+ "선호하는 유권자 수(50대) : " + this.favorite50count + "\n"
				+ "서울 지역 선호하는 유권자 수 : " + this.seoulCount + "\n"
				+ "경기 지역 선호하는 유권자 수 : " + this.gyeongGiCount + "\n"
				+ "부산 지역 선호하는 유권자 수 : " + this.busanCount + "\n"
				+ "제주 지역 선호하는 유권자 수 : " + this.jejuCount + "\n\n\n";
		return printString;
	}
}
