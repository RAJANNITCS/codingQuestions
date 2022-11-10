package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.HashSet;

public class DeleteDuplicateElementsFromArrray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,2,4,4,4,5,5,5,5,6,6,7));
	
	public void deleteDuplicateV1() {
		LinkedHashSet<Integer> temArr = new LinkedHashSet<Integer>(arr);
		arr.clear();
		arr.addAll(temArr);
		System.out.println(arr);
	}
	
	public void deleteDuplicateV2() {
		HashSet<Integer> temp = new HashSet<Integer>(arr);
		arr.clear();
		arr.addAll(temp);
		System.out.println(arr);
	}
	
	public void deleteDupicateV3() {
		int minValue = Collections.min(arr);
		int maxValue = Collections.max(arr);
		
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < arr.size(); i++) {
			hashTable[arr.get(i)] += 1;
		}
		
		arr.clear();
		for (int i = minValue; i <= maxValue; i++) {
			if (hashTable[i] >= 1) {
				arr.add(i);
			}
		}
		
		System.out.println(arr);
	}
	
	public static void main(String[] args) {
		DeleteDuplicateElementsFromArrray obj = new DeleteDuplicateElementsFromArrray();
//		obj.deleteDuplicateV1();
//		obj.deleteDuplicateV2();
		obj.deleteDupicateV3();
	}
			
}
