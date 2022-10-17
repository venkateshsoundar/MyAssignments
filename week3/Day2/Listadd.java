package week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class Listadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst=new ArrayList();
		
		lst.add(23);
		lst.add(54);
		lst.add(67);
		lst.add(66);
		lst.add(42);
		lst.add(27);
		lst.add(89);
		
		System.out.println(lst);
		
		for (Integer i:lst) {
       if(i%2!= 0) {
    	   
    	   System.out.println(i);
    	   
       }
			
		}
		
		
		
	}

}
