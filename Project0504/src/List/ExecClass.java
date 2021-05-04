package List;

import java.util.ArrayList;

public class ExecClass {
	public static void main(String[] args) {
		// list, map, queue 순으로 자주 사용하는 순서
		
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		ArrayList<CustomClass> arr3 = new ArrayList<CustomClass>();
		
		// 임시변수를 생성해서 추가해도되고
		CustomClass arr3_1 = new CustomClass();
		arr3.add(arr3_1);
		
		// 바로 추가해도 됨
		arr3.add(new CustomClass());
	}
}
