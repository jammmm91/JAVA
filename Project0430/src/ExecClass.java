
public class ExecClass {
	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		a = "Hello1";
		System.out.println(a.hashCode());
		
		if (a == b) { 
			
		}
		
		a = "Hello";
		a = a + "1"; // Hello1
		a = a + "1"; // Hello11
		a = a + "1"; // Hello111
		a = a + "1"; // Hello1111
		a = a + "1"; // Hello11111
		
		// 메모리 낭비를 하지 않기위해 쓰는 메소드
		StringBuffer c = new StringBuffer("Hello");
		c.append("1");
		System.out.println(c);
		System.out.println(c.hashCode());
		c.append("1");
		System.out.println(c);
		System.out.println(c.hashCode());
	}
}
