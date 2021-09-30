package week1.day1;

public class Calculator {

	public String test= "TestLeaf";
	//method syntax: accessmodifier Returntype methodname (args if needed){}
      //If hardcoding is not required and a &b value is dynamic then 
	
	public int addTwoNumbers(int a , int b) {
	int sum=a+b;
	return sum;
	}
	public static void main(String[] args) 
	{
	
   Calculator Cal=new Calculator();
   
   //Accessing the Global variable declared under Class by calling the object and then the variable name
   System.out.println(Cal.test);	
  int result = Cal.addTwoNumbers(100,200);
  //System.out.println(result);
  //If multiple entries are there then
  int result1 = Cal.addTwoNumbers(700,200);
  int result2 = Cal.addTwoNumbers(300,200);
   //System.out.println(result1);
 System.out.println(result+"\n"+result1+"\n"+result2);
	}
	}
	
	/*
	 * public int addTwoNumbers() { int a = 5,b = 15; int sum=a+b; return sum; }
	 * 
	 * public static void main(String[] args) { //SYNTAX TO ACCESS A METHOD INSIDE A
	 * CLASS BY defining OBJECT Calculator Cal=new Calculator(); ///int result=0;
	 * Syntax for calling //objectname.methodname //Cal.addTwoNumbers();
	 * System.out.println(result); // int result =Cal.addTwoNumbers(); int result
	 * Cal.addTwoNumbers(); //non hardcode version of calling method int result =
	 * Cal.addTwoNumbers(100,200); System.out.println(result);
	 */


