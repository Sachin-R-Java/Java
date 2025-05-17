package ex_03_Literals;

public class Lab027_Char_Literal {
	public static void main(String[] args) {
		
		char c = 'a'; // a-z, A-Z, @#$%^&*
		
		// Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r'; // delete 1 or 2 words 
        
        System.out.println("Sachin"+new_line+"Reddy");
        
        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';


	}

}
