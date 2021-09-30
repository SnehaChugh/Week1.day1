package week1.day1;

public class LearnStringMemory {
	public static void main(String[] args) {
		String str1=new String("Sneha");
		String str2=new String("Sneha");
		System.out.println(str1==str2);//It wil show false cause the memory location of both the values are different as object defined String

		//Campare Objects Strings like below
		boolean result = str1.equals(str2);
		System.out.println("result "+result);
		
		String str3= "chugh";
		String str4= "chugh";
		System.out.println(str3==str4);
		boolean equals = str3.equals(str4);
		System.out.println("equals "+equals);////It wilL show TRUE cause the memory location of both the values are SAME In literls 
		
		
	}
}
