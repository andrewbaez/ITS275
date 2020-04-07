//Andrew Baez
//ITS 275 - Spring 2020
//https://github.com/andrewbaez/ITS275package finalProject;
package finalProject;
import java.util.*;

public class GeneralInformation {

	public static void main(String[] args) {
		//Declare constants (English Units to Metric Units)
		final double METERPERINCH = 0.0254;
		final double POUNDPERKILO = 0.453592;
		//Date (constructor and object)
		Date today = new Date();
		//Initialize the variable & Use the "for" loop to welcome the user once
		for (int welcome = 0; welcome < 1; welcome++) {
			System.out.println("Welcome to the Hospital! ");
		}
		//Day of the week, the date, and the current time
		System.out.println("Today is " + today + "\n");	
		//Scanner Object
		Scanner input = new Scanner(System.in);
		//Ask Question 1
		System.out.println("What is your first name?");
		String firstName = input.next();
		//Ask Question 2
		System.out.println("What is your last name?");
		String lastName = input.next();
		//Ask Question 3
		System.out.println("What is your height in inches?");
		//Exception
		System.out.print("(Answer cannont equal zero)");
		//Question 3 (continued)
		int height = input.nextInt();
		double heightMeters = height * METERPERINCH;
		//Exception Handling
		if (height == 0) {
			System.out.println("Error: Your Height cannont be zero.");
			System. exit(0);
		}
		//Ask Question 4
		System.out.println("What is your weight in pounds?");
		//Exception
		System.out.print("(Answer cannont equal zero)");
		//Question 4 (continued)
		int weight = input.nextInt();
		double weightKilo = weight * POUNDPERKILO;
		//Exception Handling
		if (weight == 0) {
			System.out.println("Error: Your Weight cannont be zero.");
			System. exit(0);
		}
		//Ask a question
		System.out.println();
		System.out.println("Let us finish collecting your information.");
		System.out.println("How old are you?");
		int age = input.nextInt();
		//Create an object
		Age obj = new Age();
		obj.setAge(age);
		obj.showAge();
		System.out.println();
		//BMI
		double bmi = weightKilo / (heightMeters * heightMeters);
		double bmiRounded = Math.round(bmi);
		//Ask Question 5 & Associate a number with the blood type
		System.out.println("There are eight blood types: " + "A+, A-, B+, B-, O+, O-, AB+, AB-" + "\nEnter in the number assoicated with your blood type: " + "\n" + "(A+ = 1, A- = 2, B+ = 3, B- = 4, O+ = 5, O- = 6, AB+ = 7, AB- = 8");
		int bloodResult = input.nextInt();
		//Say Hello
		System.out.println("Hello " + firstName + " " + lastName + ".");
		System.out.print("Your height is " + height + " inches and your weight is " + weight + " pounds. ");
		System.out.println("Your BMI is " + bmiRounded + ".");
		//Say whether or not you are underweight, normal weight, overweight, or obese
		if (bmiRounded < 18.5) {
			System.out.println("You are underweight.");
		}
		else if (18.49 < bmiRounded && bmiRounded < 25.00) {
			System.out.println("You have a normal weight.");
			}
		else if (bmiRounded > 25.00 && bmiRounded < 30.00) {
			System.out.println("You are overweight.");
			}
		else
			System.out.println("You are obese.");
		//Pass int bloodResult to Blood.Confirm Method
		BloodType.Confirm(bloodResult);
		//Switch
		switch(bloodResult) {
		//A+
		case 1: System.out.println("Your blood type can recieve blood from people with " + "A+, A-, O+, O- blood.");
		break;
		//A-
		case 2: System.out.println("Your blood type can recieve blood from people with the O- and A- blood.");
		break;
		//B+
		case 3: System.out.println("Your blood type can recieve blood from people with the O-, O+, B+ and B- blood.");
		break;
		//B-
		case 4: System.out.println("Your blood type can recieve blood from people with the O- and B- blood.");
		break;
		//O+
		case 5: System.out.println("Your blood type can recieve blood from people with the O- and O+ blood.");
		break;
		//O-
		case 6: System.out.println("Your blood type can recieve blood from people with the O- blood.");
		break;
		//AB+
		case 7: System.out.println("Your blood type can recieve blood from people with the O-, O+, AB+, AB-, A+, A-, B+ and B- blood.");
		break;
		//AB-
		case 8: System.out.println("Your blood type can recieve blood from people with the O-, AB-, A+ and B- blood.");
		break;
		//Error Message
		default: System.out.println("Error: Invalid Input");
		//Exit Switch
		System.exit(0);
		}
		//Close scanner inputs
		input.close();
		//End Program
		System.out.println("Thank you for using this program. Goodbye.");
	}
}
