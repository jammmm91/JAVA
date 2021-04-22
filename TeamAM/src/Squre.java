
public class Squre {
	String name;
	double length;
	double heigth;
	double width;

	Squre(String name,double length,double heigth) {
	      this.name = name;
	      this.length = length;
	      this.heigth = heigth;
	      
	      
	   }

	public void width() {
	      width = length*heigth;
	      System.out.println("면적 : " + width+"\n");

}
}
