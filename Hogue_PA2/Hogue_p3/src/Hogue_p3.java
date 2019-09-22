import java.util.Scanner;

public class Hogue_p3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] responses = new int[5][10];
		int numTopics = 5;
		double[] topicAvg = new double[numTopics]; //total ratings
		double[] topicScore = new double[numTopics]; //num people
		int i;
		int row;
		int col;
		int contVal = 0;
		//String topicMax;
		//String topicMin;
		
		String[] topics = {"Healthcare Access	", "Pollution      	 	", "Millennial Financial Stability", "Food Quality	         ", "Functional Education    "};
		
		//prompt user to rate each topic
		System.out.println("Determine the rating amongst the following topics on a scale 1 through 10:\n");
		System.out.println("               Least Important:1 Most Important:10\n               Please Press 'Enter' Twice to Submit Response\n");
		
		//get topic ratings from user
		//user input phase occurs within a loop
		while (contVal == 0) {
			for (i = 0; i < topics.length; ++i) {
				System.out.println(topics[i]);
				int rateVal = scanner.nextInt();
				while ((rateVal < 1) ||	(rateVal > 10)) {
					System.out.println("Your Input was Incorrect\nPlease try again");
					rateVal = scanner.nextInt();
				}
				topicAvg[i] += rateVal;
				topicScore[i] += 1;
				responses[i][(rateVal - 1)] = responses[i][(rateVal - 1)] + 1;
			}
			System.out.println("Would you like to continue?\nPress 0 to continue\nPress any other key to quit");
			contVal = scanner.nextInt();
		}
		
		for (row = 0; row < topics.length; ++row) {
			System.out.print(topics[row]);
			for (col = 0; col < 10; ++col) {
				
				System.out.print("\t" + responses[row][col]);
			}
			
			System.out.println("\t" + (topicAvg[row] / topicScore[row]));
		}
		
		
		
		
			
		

		

	}

}
