package ex_06_Ternary_Operator;

public class Lab058_Max_Number {

	public static void main(String[] args) {
		// Task 2
		// find maximum number between three number using ternary operator.
		
		int N1=40, N2=20, N3=30;
		int max = N1>N2 ? N1>N3 ? N1:N3 : ((N2>N3)? N2:N3);
		System.out.println(max);
	} 
}
