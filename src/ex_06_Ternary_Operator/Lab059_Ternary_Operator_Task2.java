package ex_06_Ternary_Operator;

public class Lab059_Ternary_Operator_Task2 {
	public static void main(String[] args) {
		//Task 2
		// find the catagory of person (adult, minor, sr citizen) using ternary operator
		
		int age= 66;
		String result= age<18 ? "minor": (age>65 ? "sr citizen":"adult");
		System.out.println(result);
	}

}
