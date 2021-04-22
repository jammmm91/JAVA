package 연습장;

import java.util.Arrays;
import java.util.Random;

public class 랜덤숫자생성정렬 {
	public static void main(String[] args) {

		// 10개의 배열을 생성
		int arr[] = new int[10];

		// for문을 돌려서 랜덤숫자 하나씩 인덱스에 저장
		for (int i = 0; i < arr.length; i++) {
			Random r = new Random();
			int randNum = r.nextInt(100);
			arr[i] = randNum;
		}
		System.out.println("정렬전 : " + Arrays.toString(arr));

		// 버블소트 이용하여 오름차순 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
		System.out.println("정렬후 : " + Arrays.toString(arr));
	}

}
