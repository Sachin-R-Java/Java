package ex_04_Operators;

public class Lab034_Operators_Logical_Operator {

	public static void main(String[] args) {
		// ! -> Not operator
		
		boolean a=true;
		System.out.println(!a);
		
		boolean b = true;
		System.out.println(!!b);
		
		// ||  -> Or operator
	
		boolean c = true || false;
		System.out.println(c);
		
		// && -> And operator
		
		boolean d  = false && true;
		System.out.println(d);
	}
}
