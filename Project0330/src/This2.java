//
//public class Student {
//	public String name;
//	public int korScore = 0;
//	public int engScore = 0;
//	public int mathScore = 0;
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setKorScore(int score) {
//		korScore = score;
//	}
//	public void setEngScore(int score) {
//		this.engScore = score;
//	}
//	public void setMathScore(int mathScore) {
//		this.mathScore = mathScore;
//	}
//}


public class This2 {
	public String name;
	public int korScore = 0;
	public int engScore = 0;
	public int mathScore = 0;
	public int totalScore = 0;
	
	This2(String name, int korscore, int engscore, int mathScore) {
		this.name = name;
		this.korScore = korscore;
		this.engScore = engscore;
		this.mathScore = mathScore;
		this.totalScore = korscore + engscore + mathScore;
	}
	
	public void printInfo() {
		System.out.println(this.name + " : "
				+ "국어" + this.korScore + "점, "
				+ "영어" + this.engScore + "점, "
				+ "수학" + this.mathScore +"점, "
				+ "총점" + this.totalScore +"점"
				);
		
		}
}