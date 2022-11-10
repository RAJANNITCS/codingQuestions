package arrayCodingQuestions.java;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class SumOfSubArrayK {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(8, 5, -2, 3, 4, -5, 7));

	public void findSumArray(int sum) {
		HashSet<Integer> tempSet = new HashSet<Integer>();
		int sumOfEle = 0;
		for (int i = 0; i < arr.size(); i++) {
			tempSet.add(arr.get(i));
			sumOfEle += arr.get(i);
			if (sumOfEle > sum) {
				int findValue = (sumOfEle - sum);
				if (tempSet.contains(findValue)) {
					tempSet.remove(findValue);
					break;
				}
			}
		}
		
		System.out.println(tempSet);
	}

	public static void main(String[] args) {
		SumOfSubArrayK obj = new SumOfSubArrayK();
		obj.findSumArray(10);
	}
}
