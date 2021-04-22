//
//public class Student2 {
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		//s1.setName("김재민");
//		s1.name = "김재민";
//		//s1.setKorScore(100);
//		s1.korScore = 100;
//		s1.setEngScore(100);
//		s1.setMathScore(100);
//		System.out.println(s1.name + " : " + s1.korScore);
//		
//		Student s2 = new Student();
//		s2.setName("장지연");
//		s2.setKorScore(50);
//		s2.setEngScore(10);
//		s2.setMathScore(90);
//		
//		int s1_engScore = 100;
//		int s1_mathScore = 100;
//	}
//}


public class This2_2 {
	public static void main(String[] args) {
		This2 s1 = new This2("김재민", 100, 50, 100);
		This2 s2 = new This2("장지연", 15, 20, 50);
				
		s1.printInfo();		
		s2.printInfo();
	}
}