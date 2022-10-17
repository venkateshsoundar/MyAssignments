package week3.Day2assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem Statement : Print only duplicate values Expected output: 4 and 8
		 * 
		 * How to solve? 1) Regular for loop 2) Using Set
		 * 
		 * Using Set
		 * 
		 * a) Add every element into Set b) If it is already there in the Set -> Print
		 * duplicate
		 * 
		 */

		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };
		Arrays.sort(data);

		Set<Integer> uniq = new LinkedHashSet<Integer>();

		for (int i = 0; i < data.length; i++) {

			for (int ite : uniq) {
				if (data[i] == ite) {
					System.out.println("Duplicate Value:" + data[i]);
					break;
				}

			}

			uniq.add(data[i]);

		}

	}

}
