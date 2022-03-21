package inovationM;
import java.util.Hashtable;

public class CountWods {
	public String s1 = "rajan";
	public Hashtable<Character,Integer> tempArr = null;
	
	
	public void countWords() {
		this.tempArr = new Hashtable<Character, Integer>();
		char[] c1 = this.s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			this.tempArr.put(c1[i],this.tempArr.containsKey(c1[i]) ? this.tempArr.get(c1[i]) + 1 : 1);
		}
		
		System.out.println(this.tempArr);
	}
	
	public static void main(String[] args) {
		CountWods obj = new CountWods();
		obj.countWords();
	}
}
