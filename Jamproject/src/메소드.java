
public class 메소드 {
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	
//	public static void main(String[] args) {
//		int a = 5;
//		int b = 12;
//		
//		메소드 metThod = new 메소드();
//		int c = metThod.sum(a, b);
//		
//		System.out.println(c);
//	}
//
//}
	public void say(String name) {
	    if ("fool".equals(name)) {		// name자리에 fool이 들어오면 출력없이 리턴
	        return;
	    }
	    System.out.println("나의 별명은 "+name+" 입니다.");
	}
	public static void main(String[] args) {
		메소드 mtd = new 메소드();
		mtd.say("jam");		
	}
}