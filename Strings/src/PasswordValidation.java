import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PasswordValidation pv = new PasswordValidation();
		System.out.println("Enter Your Password: ");
		String password = sc.nextLine();
		boolean b = pv.checkPassword(password);
		System.out.println(b);
	}

	public boolean checkPassword(String password) {
		int length = password.length();
		int k = 0;
		int space = 0;
		if(password==null||password==" ") {
			k=0;
		}
		else {
			if(length == 8   ) {
				//k=1;
				for(int i = 0; i<length; i++) {
				/*
				 * if(password.charAt(i)==127) { space++; }
				 */
					if(password.charAt(i)>=33&&password.charAt(i)<127&&password.charAt(i)!=32) {
						k=1;
					}
					else
						k=0;
				}
			}
			else 
				k=0;
		}
		
		if(k==0) {
			System.out.println("invalid");
			return false;
		}
		else {
			System.out.println("valid");
			return true;
		}
}
}
//abc123@Q
//  a@123Q