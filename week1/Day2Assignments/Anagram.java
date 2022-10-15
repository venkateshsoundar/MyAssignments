package week1.Day2Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Anagram ang=new Anagram();
System.out.println(ang.isAnagram("post", "stop"));
	}
	
	/*
	Do not change the class and method name of this code.
	Write your logic after the comment - write your code here
	*/
		public  boolean isAnagram(String input1, String input2) {
				
				// write your code here
		      boolean isAnagram=false;
				
		      int len1=input1.length();
		      int len2=input2.length();
		      
		      
		      if(len1==len2){
		        
		        char ch1[]=new char[len1];
		        char ch2[]=new char[len2];
		        
		        for(int i=0;i<len1;i++){
		        ch1[i]=input1.charAt(i);  
		        ch2[i]=input2.charAt(i);
		         }
		        
		        Arrays.sort(ch1);
		        Arrays.sort(ch2);
		       isAnagram = Arrays.equals(ch1,ch2);
		        
		                }
		      
		return isAnagram;
		}
	}

