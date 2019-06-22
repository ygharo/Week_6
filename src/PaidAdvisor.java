
public class PaidAdvisor extends Person {

	protected double regularPayRate = 25;  //# variables to be used in the pay methods
	protected double specialPayRate = 50;
	protected double overtimePayRate = 37.50;

	protected double hoursSpecial;   //class instance variables which are equivalent to the main class
	//variables that store the scanner returned values
	protected double regularHours; 
	protected double overtimeHours;
	protected double hoursWorked;


	public PaidAdvisor(String first, String last, double specialHours, double overtime, double regular) {
		super(first, last);
		specialHours = hoursSpecial;  //specialHours, overtime, and regular are the variables that in a main method
		//will store the scanner values
		overtime = overtimeHours;
		regular = regularHours;
	}
	
	
	public double getRegularPayRate() {
		return regularPayRate;
	}



	public void setRegularPayRate(double regularPayRate) { //constructor to set regularPayRate
		this.regularPayRate = regularPayRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double totalHours) {
		this.hoursWorked = totalHours;
	}


	public double getSpecialPayRate() {
		return specialPayRate;
	}



	public void setSpecialPayRate(double specialPayRate) {
		this.specialPayRate = specialPayRate;
	}



	public double getOvertimePayRate() {
		return overtimePayRate;
	}



	public void setOvertimePayRate(double overtimePayRate) {
		this.overtimePayRate = overtimePayRate;
	}


	public double getHoursSpecial() {
		return hoursSpecial;
	}



	public void setHoursSpecial(double hoursSpecial) {
		this.hoursSpecial = hoursSpecial;
	}



	public double getRegularHours() {
		return regularHours;
	}


	public void setRegularHours(double regularHours) {
		this.regularHours = regularHours;
	}


	//------------------------------------------------------------------------------------------
	//calculatePay methods

	public double regularPay(double regularHours) {
		double payment = regularPayRate * regularHours;

		return payment;
	}
	public double overtimePay(double overtimeHours) {
		double payment = overtimePayRate * overtimeHours;

		return payment;
	}

	
	public double specialPay(double hoursSpecial) {
		double payment = specialPayRate * hoursSpecial;

		return payment;
	}
	
	
}

