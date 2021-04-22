
public class Parallelogram {
	String name;
	   double length;
	   double height;
	   double result;
	   
	   Parallelogram(String name,double length, double height) {
	      this.name = name;
	      this.length = length;
	      this.height = height;
	   }
	   public void width() {
	      double result = length * height;
	      System.out.println("넓이 : " + result+"\n");
	   }
}
