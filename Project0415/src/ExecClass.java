import java.util.Arrays;
import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		
//		s1.name = "김재민";
//		s1.middleScore = 900;
//		s1.finalScore = 950;
//		
//		Student s2 = new Student("잼아저씨");
//		Student s3 = new Student("장지연",500,400);
		
		Student[] class1 = {
			new Student("장준영"),
			new Student("김재민"),
			new Student("김정연"),
			new Student("김남덕"),
			new Student("박준형"),
			new Student("임시진"),
			new Student("최성운"),
			new Student("백두용"),
			new Student("김승현"),
			new Student("이지효")			
		};
		Random random = new Random();
		for (int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(1001);
			class1[i].finalScore = random.nextInt(1001);
		}
		System.out.println(Arrays.toString(class1));
	}

}
