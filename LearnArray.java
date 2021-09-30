package week1.day1;

import java.util.Iterator;

public class LearnArray {
public static void main(String[] args) {
	int Age=24;
	//when assigning multiple values against a single variable is when arrays are used
	//how to declare an array see below
	int[] ages= {1,2,3,4};
	int length = ages.length;//LENGTH IN ARRAY IS NOT A METHOD Its a property
	System.out.println("length of the Array "+length);
	
	for (int i = 0; i < ages.length; i++) {
		System.out.println(ages[i]);
	}
	
	//below Creating an empty array//Its mandatory to give the size of any array implicitly or explicitly
	// Cannot create an open ended array
		String[] names= new String[5];
		names[0]="Manikandan";//explicitly added values to array
		names[1]="Sundar";
		names[2]="vanshu";
		names[3]="sneha";
		names[4]="ramdas";
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	System.out.println("-------------------------------------");
	
	for (String localvariable : names) {
		System.out.println(localvariable);
	}
	
	
}
}
