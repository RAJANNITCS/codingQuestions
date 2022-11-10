//Given a list of state objects,print the state codes that begin with A.
package java8newFeature.streamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PrintStateCode {
	public ArrayList<State> arr = new ArrayList<State>();
	
	public static void main(String[] args) {
		PrintStateCode obj = new PrintStateCode();
		obj.arr.add(new State("A0001", 1));
		obj.arr.add(new State("B0001", 2));
		obj.arr.add(new State("C0001", 3));
		obj.arr.add(new State("F0001", 4));
		obj.arr.add(new State("A0001", 5));
		obj.arr.add(new State("R0001", 6));
		obj.arr.add(new State("A0001", 7));
		obj.arr.add(new State("A0001", 8));
		obj.arr.add(new State("A0001", 9));
		obj.arr.add(new State("A0001", 10));
		
		
		ArrayList<State> temp = (ArrayList<State>) obj.arr.stream().filter(e -> e.getStateName()
				.startsWith("A")).collect(Collectors.toList());
		
		temp.forEach(System.out :: println);
	}
}
