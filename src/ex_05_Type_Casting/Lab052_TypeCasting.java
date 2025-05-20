package ex_05_Type_Casting;

public class Lab052_TypeCasting {
	public static void main(String[] args) {
		int course =100;
		float tax= 18.50f;
		
		// int total = course+tax; Implicit Narrowing - Not Possible
		
		int total = course + (int)tax; // Explicit narrowing - data will loss
		System.out.println(total);
		
		float total1 = course+tax; // Implicit Widening - done auto.
		// float total2 = (float)course+tax; Explicit Widening - manually done 
		 System.out.println(total1);
		
	}
}
