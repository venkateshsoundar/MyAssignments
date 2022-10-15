package week1.Day2Assignments;

public class Arm {
	
		public boolean isArmStrong(long num) {

			// Write your code here		
	     boolean ans=false;
	      
	      long sum=0;
	      long rem=0; 
	      while(num>0){
	       rem=num%10;
	      // System.out.println(rem);
	     
	        num=num/10;
	      sum=sum+(rem*rem*rem);
	     System.out.println(num);
	     System.out.println(sum);
	      }
	      
	      if (sum==num){

	    	  
	    	  ans=true;
	            
	        }
	      
	       return ans;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arm obj1=new Arm();
		System.out.println(obj1.isArmStrong(153));
	}

}
