package pakage;
public class baseMethod {
   double area = 0;
   String name;

   baseMethod(String name) {
      this.name = name;
   }

   public void input() {
      
   }// end input

   public void calcArea() {

   }// end calcArea

   public void printConsole() {
      this.calcArea();
      System.out.println(name + "의 면적 : " + this.area);
   }// end printConsole

}// end class