import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rabbit {
   public static void main(String[] args) throws FileNotFoundException {
      System.setIn(new FileInputStream("src/input.txt"));

      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();

      for (int i = 0; i < test; i++) {
         int map[][] = new int[21][21];
         int cnt = 0;
         int rabbitnum = sc.nextInt();
         int foxX = sc.nextInt();// 여우 x좌표 생성
         int foxY = sc.nextInt();// 여우 y좌표 생성
         map[foxX][foxY] = 2;// 여우는 2

         // 3마리 토끼 좌표 생성
         for (int j = 0; j < rabbitnum; j++) {
            int rabbitX = sc.nextInt();
            int rabbitY = sc.nextInt();
            map[rabbitX][rabbitY] = 1; // 토끼는 1
         }
         for (int j = 1; j < map.length; j++) {
            for (int k = 1; k < map[i].length; k++) {
               if (map[j][k] == 1) {
                  //가로
                  if (j == foxX) {
                     cnt++;
                     //세로
                  } else if (k == foxY) {
                     cnt++;
                  } else if (Math.abs((double) (j -foxX) / (double) (k -foxY)) == 1.0) {
                     cnt++;
                  }
               }
            }

         }
         
      

         System.out.println("여우가 토끼를 잡은 횟수 : " + cnt);
      }

   }

}