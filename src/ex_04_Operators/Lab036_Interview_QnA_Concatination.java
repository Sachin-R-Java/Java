package ex_04_Operators;

public class Lab036_Interview_QnA_Concatination {

	public static void main(String[] args) {
		
		String fName = "sachin";
		String lName= "virat";
		
		int a = 10;
		int b = 20;
		
		System.out.println(fName+lName+a+b); // + -> Acting as a joiner 
		System.out.println(a+b+fName+lName);// + -> Acting as a Math
		System.out.println(fName+lName+(a+b));// = -> Acting as a Math (Bodmas principle - first bracket will resolve)
		
	}
}
