package ex_02_Java_Basics_Part2;

public class Lab020_Task_1 {
	public static void main(String[] args) {
		int num =5;
		
		for(int i =1; i<=10;i++) {
			int mul = num*i;
			System.out.printf("%d * %d = %d", num,i,mul);
			System.out.println();
		}
	}

}
