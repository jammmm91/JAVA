public class 성적메소드 {
	String name;
	int middleScore;
	int finalScore;
	int totalScore;
	int averageScore;

	성적메소드(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;

		this.totalScore = this.middleScore + this.finalScore;
		this.averageScore = (middleScore + finalScore) / 2;
	}

	public String toString() {
		return "\n"+this.name + " / 평균 : " + this.averageScore;
	}
}