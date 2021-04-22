import java.util.Arrays;
import java.util.Random;

//0~100까지 임의의 수를 30개 발생시켜서 배열에 넣은 후 정렬하시오.
//조건1) 정렬 전/후의 값을 화면에 출력
//조건2) 소트 알고리즘 중 사용한 알고리즘을 설명한 레포트 (형식 무관,내용만 제출)첨부
//비고. 정렬 알고리즘 및 이중 루프문에 대한 공부는 따로 하셔야 합니다
//(서로간의 정보 교환 가능)

public class 버블소트 {
   public static void main(String[] args) {
      int number[] = new int[10];
      Random r = new Random();
      
      for (int i = 0; i < number.length; i++) {
         int num = r.nextInt(101);
         number[i] = num;
         }
         System.out.println("정렬전 : " + Arrays.toString(number));
         
         for(int j = 0; j < number.length -1 ; j++) {   
            for(int m = 0; m < number.length-1-j; m++) {
               if(number[m] > number[m+1]){
                  int num = number[m];
                  number[m] = number[m+1];
                  number[m+1] = num;  
               } 
            }
         }
         System.out.println("정렬후 : " + Arrays.toString(number));
   }
}