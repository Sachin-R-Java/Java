package ex_04_Operators;

public class Lab040_OR_AND_Gate {

	public static void main(String[] args) {
		// OR Gate
		
		System.out.println(true || true); // true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		
		// AND Gate
		
		System.out.println(true && true); // true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false
	}
}
