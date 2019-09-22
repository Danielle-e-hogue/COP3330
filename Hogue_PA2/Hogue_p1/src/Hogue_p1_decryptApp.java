import java.util.Scanner;

public class Hogue_p1_decryptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eight-Digit Decryption ");
		System.out.println("(After Each Input Press 'Enter' Key To Continue)");
		System.out.println("Enter Ecrypted Digits, Please: ");
		
		double numZero = scanner.nextDouble();
		double numOne = scanner.nextDouble();
		double numTwo = scanner.nextDouble();
		double numThree = scanner.nextDouble();
		
		numZero = (numZero * 10) - 7;
		numOne = (numOne * 10) - 7;
		numTwo = (numTwo * 10) - 7;
		numThree = (numThree * 10) - 7;
		
		System.out.println("Four-Digit Decryption Equals: ");
		System.out.println(+ (int)numTwo + " " + (int)numThree + " " + (int)numZero + " " + (int)numOne);
		
		//ADD COMMENTS
		
		scanner.close();
	}

}
