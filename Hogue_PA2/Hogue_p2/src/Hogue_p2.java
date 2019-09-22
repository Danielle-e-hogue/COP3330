import java.util.Scanner;

/*
 * Create a BMI calculator that reads the user’s weight and height (providing an option for 
 * the user to select which formula to use), and then calculates and displays the user’s
 *  body mass index. Also, display the BMI categories and their values from the National 
 *  Heart Lung and Blood Institute: http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm 
 *  (Links to an external site.) so the user can evaluate his/her BMI.
 */



public class Hogue_p2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Body Mass Index(BMI) Calculator");
		System.out.println("Would you like to use enter Height and Weight by the Imperial System or Metric System");
		System.out.println("     Please Press Enter After Each Input To Submit Response");
		System.out.print("Type 1 for Imperial System(Pounds and Inches) or 2 for Metric System(Kilograms and Meters):");
		int userSelection =  scanner.nextInt();
		
		double bMi;
		System.out.println("");
		
		if (userSelection < 2) {
			System.out.println("You've Selceted The Imperial System BMI Calculator");
			System.out.println("Please Enter Your Height in Inches: ");
			double userHeight = scanner.nextInt();
			System.out.println("Please Enter Your Weight in Pounds: ");
			double userWeight = scanner.nextInt();
			bMi = ((703 * userWeight) / Math.pow(userHeight, 2));
			System.out.println("Your BMI is " +bMi);
		}
		else {
			System.out.println("You've Selected The Metric System BMI Calculator");
			System.out.println("Please Enter Your Height in Meters: ");
				double userHeight = scanner.nextInt();
			System.out.println("Please Enter Your Weight in Kilograms: ");
				double userWeight = scanner.nextInt();
			bMi = (userWeight / Math.pow(userHeight, 2));
			System.out.println("Your BMI is " +bMi);
			
		}
		
		scanner.close();
		//Print statement asking if the user would like to use The Imperial System "(703 x weight in pounds) / height in Inches^2"or The Metric System "(Weight in Kilograms) / height in Meters ^2 "
		// offer select blank button for blank if else
		//Scan for weight and height
		
		//Write expressions for Both BMI equations
		if(bMi < 18.5) {
			System.out.println("The Calculated BMI Indicates Underewight");
		}
		
		if((bMi >= 18.5) && (bMi < 25)) {
			System.out.println("The Calculated BMI Indicates Normal Weight ");	
		}
		if ((bMi >= 25) && (bMi < 30)) {
			System.out.println("The Calculated BMI Indicates Over Weight");
		}
		if (bMi >= 30) {
			System.out.println("The Calculated BMI Indicates Obesity");
		}
		
			
/*Underweight = <18.5
Normal weight = 18.5–24.9
Overweight = 25–29.9
Obesity = BMI of 30 or greater
*/
		
		//Why do I have to press enter twice
			System.out.println("BMI categories and their values are from the National Heart Lung and Blood Institute");
	}

}
