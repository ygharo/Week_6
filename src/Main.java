import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double rH;
		double oT;
		double sH;
		double total;
		
		System.out.println("\t\t\tWelcome to GetYourMoney App!" + "\nWe'll ask you few questions to calculate your pay. If one or more of the following questions does NOT apply to you please enter the 0 value." 
		+ "\n\n\tHow many hours did you work this week?");
		Scanner scan = new Scanner(System.in);
		double totalHours=scan.nextDouble();
		
		System.out.println("\n\tHow many of those hours were regular pay hours?");
		double regular = scan.nextDouble();

		System.out.println("\n\tPlease enter the number of special hourse you completed this week: ");
        double specialHours = scan.nextDouble();

		System.out.println("\n\tHow many overtime hours did you complete this week?");
        double overtime = scan.nextDouble();

		PaidAdvisor researchConsultant = new PaidAdvisor(null, null, specialHours, specialHours, specialHours);
		researchConsultant.setHoursWorked(totalHours);
		
		oT = researchConsultant.overtimePay(overtime);
		sH = researchConsultant.specialPay(specialHours);
		rH = researchConsultant.regularPay(regular);
		total = oT + sH + rH;

		System.out.println("Here is the breakdown of your earnings this week: " 
		+ "\n\tYour regular hours pay adds up to $" + rH);
		System.out.println("\tYour pay coming from special hours is $" + sH);
		System.out.println("\tYour pay for the overtime hours is $" + oT);
		System.out.println("You worked a total of " + totalHours + " hours this week. Your total remuneration then adds up to $" + total);
		
	}

}