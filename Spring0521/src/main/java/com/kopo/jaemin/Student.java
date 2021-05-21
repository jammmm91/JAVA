package com.kopo.jaemin;

public class Student {
	int idx;
	String name;
	int middleScore;
	int finalScore;
	String created;
	
	Student() {
		
	}
	
	Student(String name, int middleScore, int finalScore, String created) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
		this.created = created;
	}
	
	Student(int idx, String name, int middleScore, int finalScore, String created) {
		this.idx = idx;
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
		this.created = created;
	}
}
