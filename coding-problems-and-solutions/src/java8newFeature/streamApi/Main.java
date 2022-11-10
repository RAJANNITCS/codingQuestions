package java8newFeature.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0) {
				temp.add(arr.get(i));
			}
		}
//		System.out.println(temp);
		
		ArrayList<Integer> temp_1 = (ArrayList<Integer>) arr.stream().filter(e -> e % 2== 0).
				collect(Collectors.toList());
		
		System.out.println(temp_1);
	}
}
