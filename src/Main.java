import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("\tWelcome to \"GetYourMoney App\"!"
				+ "\nWe'll ask you few questions to calculate your pay. If one or more of the following questions does NOT apply to you, please enter the 0 value."
				+ "\n\n\tPlease enter your First Name: ");

		String firstName = scan.next(); // storing the scanner values

		System.out.print("\n\tPlease enter your Last Name: ");
		String lastName = scan.next();

		System.out.print("\n\tHow many hours did you work this week?");
		double totalHours = scan.nextDouble();

		System.out.print("\n\tPlease enter the number of special hours you completed this week: \n");
		double specialHours = scan.nextDouble();

		PaidAdvisor researcher = new PaidAdvisor();
		double rate = researcher.getPayRate(totalHours);
		researcher.setNameRateHours(firstName, lastName, rate, totalHours, specialHours);

		System.out.println(researcher.toString());
		System.out.println("Your earnings this week: $" + researcher.calculatePay(totalHours, specialHours));

	}
}
