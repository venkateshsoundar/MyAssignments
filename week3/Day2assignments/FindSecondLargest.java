package week3.Day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code: a) Create a empty Set Using TreeSet b) Declare for loop iterator
		 * from 0 to data.length and add into Set c) converted Set into List d) Print
		 * the second last element from List
		 * 
		 * 
		 */

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> treste = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			treste.add(data[i]);
		}

		System.out.println(treste);
		List<Integer> lst = new ArrayList<Integer>(treste);

		System.out.println("Second Largest Number:"+lst.get(lst.size() - 2));

	}

}
