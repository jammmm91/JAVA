package test;


public class Student {
	String name; 
	int middleScore;
	int finalScore;
	int totalScore;
	double avgScore;
	int rank;
	//생성자
	Student() {
		
	}
	//생성자
	Student(String name) {
		this.name = name;
	}
//	생성자
	Student(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
	public void sumScore() {
		this.totalScore = this.middleScore + this.finalScore;
		this.avgScore = this.totalScore / (double)2;
	}
	
	@Override
	public String toString() {
		return "" + this.name
				+ " (" + this.middleScore + ", "
				+ this.finalScore + ")";
	}
}