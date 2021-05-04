import com.kopo.Test;

public class ExecClass {
	public static void main(String[] args) {
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		
		Test t1 = new Test();
		
		int a = 10;
		double b = 20;
		Integer c = 20;
		Double d = 10.0;
		Double d1 = new Double(20.0);
		
		for (int i = 0; i < 101; i++) {
			
			// "%4d로 4자리로 만듬"
			String tmpString1 = String.format("%4d", i); 
			
			// "%04d 4자리로 만들고 빈칸은 0으로 채움
			String tmpString2 = String.format("%04d", i);
			
			System.out.println(tmpString1);
			System.out.println(tmpString2);
		}
	}
}