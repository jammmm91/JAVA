//!5의 값

public class 재귀함수2 {
public static void main(String[] args) {
      System.out.println(myRecursive(5));
   }
      public static int myRecursive(int n) {
      if(n <= 1) return 1;
      
      return n * myRecursive(n-1);
    }
}