package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NamesM {

	public static void main(String[] args) {
		
		List<String> lst=new ArrayList();
		lst.add("Arun");
		lst.add("Deepa");
		lst.add("Maria");
		lst.add("Deepa");
		lst.add("Sharmila");
		lst.add("Muthu");
		lst.add("Chinrasu");
		
		Collections.sort(lst);
		
		for (String i:lst) {
			
			if(i.startsWith("M")) {
				System.out.println(i);
			}
		}
		
		
			}

}
