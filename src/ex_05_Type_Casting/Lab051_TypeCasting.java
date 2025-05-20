package ex_05_Type_Casting;

public class Lab051_TypeCasting {

	public static void main(String[] args) {
		
		long mob = 8888888888l;
		
		// short s=mob; Implicit Narrowing - not possible
		
		short s = (short)mob; // Explicit Narrowing - done manually.
		System.out.println(s);
	}
}
