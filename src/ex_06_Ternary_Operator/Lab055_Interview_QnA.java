package ex_06_Ternary_Operator;

public class Lab055_Interview_QnA {

	public static void main(String[] args) {
		// Nested Ternary
		// result = condition1 ? expression1 : (condition2 ? expression 2: expression3);
		int age = 19;
		String result = (age > 18) ? (age > 25 ? "You can go to Goa, but you can drink" : "You can go to Goa, but You can't Drink") : "You can't go GOA";
		System.out.println(result);
	}
}
