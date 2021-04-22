package test;

import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
		Student[] student = { new Student(), new Student(), new Student() };
		Student[] student1 = { new Student("김재민"), new Student("장준영"), new Student() };
		Student[] student2 = { new Student("김재민", 26, 26), new Student("장준영"), new Student() };

		Student wkdwnsdud = new Student();
		
		
		wkdwnsdud.sumScore();
		
		student2[2].middleScore = 155;
		System.out.println(Arrays.toString(student2));
	}

}
