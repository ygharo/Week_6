
public class Person {
	private String firstName; // instance var to store the values
	private String lastName;

	public Person() { // default constructor which is made off,,,
		firstName = "";
		lastName = "";

	}

	public Person(String first, String last) { // constructor that takes parameters
		setName(first, last); // method to print the first and last name. The setName method is defined below

	}

	public String setName(String first, String last) { // assigns values to the formal parameters
		firstName = first;
		lastName = last;
		return first + last;
	}

	public String getFirstName() { // returns the value that this var takes
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return (firstName + " " + lastName);
	}

}
