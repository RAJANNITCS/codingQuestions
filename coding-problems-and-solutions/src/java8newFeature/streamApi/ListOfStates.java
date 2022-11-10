// given a list of state objects, print the state codes.
package java8newFeature.streamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListOfStates {
	public ArrayList<State> arr = new ArrayList<State>();
	
	public static void main(String[] args) {
		ListOfStates obj = new ListOfStates();
		obj.arr.add(new State("A", 1));
		obj.arr.add(new State("B", 2));
		obj.arr.add(new State("C", 3));
		obj.arr.add(new State("D", 4));
		obj.arr.add(new State("E", 5));
		obj.arr.add(new State("F", 6));
		obj.arr.add(new State("G", 7));
		obj.arr.add(new State("H", 8));
		obj.arr.add(new State("I", 9));
		obj.arr.add(new State("J", 10));
		
//		obj.arr.stream().forEach(e -> System.out.println(e.getStateName()));
		
//		obj.arr.stream().forEach(e -> System.out.println(e.getStateCode()));
		
		ArrayList<Integer> temp_1 = (ArrayList<Integer>) obj.arr.stream().map(State::getStateCode).
				collect(Collectors.toList());
		
		System.out.println(temp_1);
		
		ArrayList<String> temp_2 = (ArrayList<String>) obj.arr.stream().map(State::getStateName)
				.collect(Collectors.toList());
		
		System.out.println(temp_2);
	}
}
