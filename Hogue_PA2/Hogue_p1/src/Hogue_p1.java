import java.util.Scanner;

public class Hogue_p1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Four-Digit Encryption ");
		System.out.println("(After Each Input Press 'Enter' Key To Continue)");
		System.out.println("Enter Four-Digits, Please: ");
		
		double numZero = scanner.nextInt();
		double numOne = scanner.nextInt();
		double numTwo = scanner.nextInt();
		double numThree = scanner.nextInt();
		
		numZero = (numZero + 7) / 10;
		numOne = (numOne + 7) / 10;
		numTwo = (numTwo + 7) / 10;
		numThree = (numThree + 7) / 10;
		
		System.out.println("Four-Digit Encryption Equals: ");
		System.out.println(+ numTwo + " " + numThree + " " + numZero + " " + numOne);
		
		//What am I supposed to do with the second class
		//ADD COMMENTS
		
		scanner.close();
	}
}

 /*Your application should read a four-digit integer entered by 
  * the user and encrypt it as follows: Replace each digit with 
  * the result of adding 7 to the digit and getting the remainder 
  * after dividing the new value by 10. Then swap the first digit 
  * with the third, and swap the second digit with the fourth. 
  * Then print the encrypted integer. Write a separate application
  *  that inputs an encrypted four-digit integer and decrypts it 
  *  (by reversing the encryption scheme) to form the original 
  *  number.   */
  