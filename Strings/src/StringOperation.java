import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringOperation {

	public static void main(String[] args) {
		StringOperation obj = new StringOperation();
		StringReverse strVar = new StringReverse();
		Scanner sc = new Scanner(System.in);
		
		  
		  
		  System.out.println("This is for Format a number with leading zero’s...:");
		  System.out.println("-------------------------------");
		  System.out.print("Enter String Number: ");
		  String number = sc.next();
		  number = String.format(number, args);
		  System.out.println(number);
		  
	}

	

	


	public void reverse(StringBuffer str) {
		//int n = 
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

	public void reverseWithoutBuffer(String s) {
		for(int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	
	public void reversebyWordToken(String s) {
		for(int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print(" ");
	}

	public void reversebyWord(String strArray) {
		for(int i = strArray.length()-1; i >= 0; i--) {
			System.out.print(strArray.charAt(i));
		}
		System.out.print(" ");
	}

	public void checkDigit(String checkDigit) {
		for(int i = 0; i<checkDigit.length(); i++) {
			char c = checkDigit.charAt(i);
			if(!Character.isDigit(c)) {
				System.out.println(c + ": "+"Is Not A Digit");
			}
			else {
				System.out.println(c +": "+"Is A Digit");
			}
		}
		
	}
	
	public void charArraytoStringcopyvalueof(char[] ch) {
		String chartoString = String.copyValueOf(ch);
		System.out.println(chartoString);
		
	}



	public void charArraytoStringvalueof(char[] ch) {
		String chartoString = String.valueOf(ch);
		System.out.println(chartoString);
	}

	
}
class StringReverse {
	private StringBuffer sb;
	private String s;
	

	public StringBuffer getStrVar() {
		return sb;
	}

	public void setStrVar(StringBuffer sb) {
		this.sb = sb;
		
	}
	public void setStrVar(String s) {
		this.s = s;
		
	}
	
	
}
