package ex_02_Java_Basics_Part2;

public class Lab019_Printf {
	public static void main(String[] args) {
		// printf -> used for formatting the output.
		int a =10;
		int b = 20;
		System.out.println();
		
		System.out.printf("Value of variable a is %d",a);
		System.out.println();
		// %d -> int, byte, long, float data type
		// %s -> string
		// %f -> float, double
		// %b -> boolen
		
		System.out.printf("value of a is %d, value of b is %d", a,b);
	}

}
