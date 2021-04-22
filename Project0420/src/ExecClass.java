import java.util.ArrayList;

public class ExecClass {
	public static void main(String[] args) {
		Student[] s1 = {new Student("김재민", 500), new Student("장준영", 400), new Student("김승현", 300)};
		
		Student[] s2 = new Student[3];
		s2[0] = new Student("김재민", 501);
		s2[1] = new Student("장준영", 401);
		s2[2] = new Student("김승현", 301);
		
	  // <> = 제네릭의형태
		ArrayList<Student> s3 = new ArrayList<Student>();
		s3.add(new Student("김재민", 502));
		s3.add(new Student("장준영", 402));
		
		s3.get(0).name = "잼아저씨";  //s3[0]과 같은 느낌
		s3.get(1).middleScore = 0;
		
		for (int i = 0; i < s3.size(); i++) {
			System.out.println(s3.get(i).name + " 의 중간고사 점수 : " + s3.get(i).middleScore);
		}
	}

}
