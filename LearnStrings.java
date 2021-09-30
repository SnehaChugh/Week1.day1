package week1.day1;

public class LearnStrings {
	public static void main(String[] args) {

		// Below creation of String Literal which is faster in performance
		String text1 = "SnehaRAMDAS";
		String text2 = "Chugh";
		// Below creation of String using object which is slower
		// String text2= new String("Ramdas!@#$%^^");
		String lowerCase = text1.toLowerCase();// This will not change any value cause once you have declared a string
		// its value cannot be modified.
		System.out.println("lowerCase: " + lowerCase);

		String upperCase = text1.toUpperCase();
		System.out.println("upperCase " + upperCase);

		// below qill give mw the length of the string
		int length = text1.length();
		System.out.println("length " + length);

		// Concat or adding two stringsvalues
		String Concat = text1 + text2; //here + is used cuased String and Concatinate with any datatype
		System.out.println(Concat);
		//text1.concat(text2) then ctrl2 and L this is another way to concat // this method allows only string concat not anypther data type

		String concat2 = text1.concat(text2);
		System.out.println(concat2);

		// Camparing two strings
		String word1="SNEHA ramdas";
		String word2="Sneha";
		boolean equals = word2.equals(word1);
		System.out.println("answer :"+equals);
		//Strings above step validates including  the case sensitivity as well
		//Below is how you ignore the case sensitivity while validation(either one can be used)
		boolean equalsIgnoreCase = word1.equalsIgnoreCase(word2);
		System.out.println(equalsIgnoreCase);

		//below is how we check for contents in a string If it contains or not
		boolean contains = word1.contains("ramdas");
		System.out.println(contains); 

		//Elimiate the spaces in the string
		String word3= "           Sri Krishna Tavasmi         ";
		System.out.println(word3);
		String trim = word3.trim();		
		System.out.println(trim);
		
		// In order to replace any value in the trimmed string above then below is the function 
		String replace = trim.replace("Sri", "Jai");
		System.out.println(replace);

		
		//SUB STRING CREATION
		
		String word4="Amudhavalli";
		String substring = word4.substring(6);
		System.out.println(substring);
		String substring2 = word4.substring(0, 6);
		System.out.println(substring2);
		
		for(int i=0;i<word4.length();i++) {
		char charAt = word4.charAt(i);//PROVIDES THE character at the specified index 
		System.out.println(charAt);
		//In case If you want index of all the characters use for loop as specified ababove




		}


	}
}
