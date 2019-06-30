public class PaidAdvisor extends Person {


	protected double regularPayRate; // # variables to be used in the pay methods
	protected double specialPayRate;
	protected double overtimePayRate;

	protected double hoursSpecial;
	private double totalPaid;
	protected double hoursWorked;

	String name;
	
	public PaidAdvisor() {

		regularPayRate = 25;
		specialPayRate = 50;
		overtimePayRate = 1.5 * regularPayRate;

	}

//Setters & Getters
	public void setNameRateHours(String first, String last,

			double rate, double totalHours, double specialHours) {

		hoursSpecial = specialHours;
		hoursWorked = totalHours; // specialHours, and totalHours are the variables that in a main method
		// will store the scanner values
		name = setName(first, last);

	}

	
	public double getPayRate(double totalHours) {// getter to return either of the pay rates

		if (totalHours > 30) { // if the employee works 29hrs they are all regular none should be special hours
			// "Whenever the worker works more than 30 hours"

			return overtimePayRate;

		} else {

			return regularPayRate;

		}

	}

	public double getHoursWorked() {

		return hoursWorked; // will be totalHours in main as set in setNameRateHours()

	}

	private double specialPay() {
		double payment = hoursSpecial * specialPayRate;
		return payment;
	}

	public double calculatePay(double totalHours, double specialHours) {

		if (totalHours > 30) { // regular hours+ overtime hours+ special hours

			totalPaid = (((totalHours - 30 - specialHours) * overtimePayRate) + (30 * regularPayRate) + specialPay());

		} else { // if (totalHours<=30) all hours ARE regular hours, no special hour will be calculated
					// because
			// "Whenever the worker works more than 30 hours" everything else kicks in

			totalPaid = totalHours * regularPayRate;

		}

		return totalPaid;

	}

	public String toString() {

		return "Name: " + super.toString() + "\nTotal Hours: " + hoursWorked + "\nTotal of Special Hours: " + hoursSpecial
				+ "\nRegular pay rate: $" + regularPayRate + "\nSpecial pay rate: $" + specialPayRate
				+ "\nOvertime pay rate: " + overtimePayRate;

	}

}

