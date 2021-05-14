import java.util.ArrayList;
import java.util.Collections;

public class ExecClass {
	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		stdList.add(new Student("김재민",70));
		stdList.add(new Student("장준영",50));
		stdList.add(new Student("김하나",76));
		stdList.add(new Student("김남덕",12));
		stdList.add(new Student("임시진",45));
		stdList.add(new Student("최성운",83));
		stdList.add(new Student("백두용",39));
		stdList.add(new Student("김승현",25));
		stdList.add(new Student("김정연",66));
		stdList.add(new Student("이경률",78));
		
		Collections.sort(stdList);
		
		for (int i =0; i < stdList.size(); i++) {
			System.out.println((i+1) + "st) " +stdList.get(i).name + " : " + stdList.get(i).score);
		}
	}

}
