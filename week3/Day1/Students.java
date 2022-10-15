package week3.Day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std=new Students();
		std.getStudentInfo(07, "Venkatesh");
		std.getStudentInfo("venkimech1992@gmail.com", 8056317686L);
	}

	
	public void getStudentInfo(int id,String name) {
		
		System.out.println(id);
		System.out.println(name);
		
	}
	
public void getStudentInfo(String email,long phonenumber) {
	
	System.out.println(email);
	System.out.println(phonenumber);
			
		
	}
	
}
