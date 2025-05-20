package ex_05_Type_Casting;

public class Lab050_TypeCasting {

	public static void main(String[] args) {
		// Narrowing - higher to lower
		
		int val = 300;
		// byte b =val; Implicit narrowing. not possible
		byte b1 = (byte)val; // Explicit narrowing done manually.
		
	}
}
