//Andrew Baez
//ITS 275 - Spring 2020
//https://github.com/andrewbaez/ITS275
package finalProject;
import java.util.*;

public class GeneralInformation {
	//Declare constants (English Units to Metric Units)
		static double METERPERINCH = 0.0254;
		static double POUNDPERKILO = 0.453592;
	
	public static void main(String[] args) {
		//Date (constructor and object)
			Date today = new Date();
		//Initialize the variable & Use the "for" loop to welcome the user once
			for (int welcome = 0; welcome < 1; welcome++) {
				System.out.println("Welcome!");
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
			System.out.println();
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
			System.out.println();
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
		//Pass int bloodResult to BloodType.Confirm Method
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
		System.out.println();
		System.out.println();
		System.out.println("Thank you " + firstName + " for all that information! Now we will test your general knowledge including basic math, basic anatomy, etc.!");
		System.out.println("Hope you're ready!");
		System.out.println();
		//Implementing Abstract Classes & Overriding
			String genCorrect1 = "YES";
			TestSub test = new TestSub();
			test.fingersAndToes();
			String genAnswer1 = input.next();
			System.out.println("You answered " + genAnswer1);
			System.out.println("The correct answer is " + genCorrect1);
		//Implements Abstract Interfaces
			System.out.println();
			System.out.println("Next Question: ");
			Test2Sub test1 = new Test2Sub();
			test1.Quarentine();
			String genAnswer2 = input.next();
			System.out.println("You answered " + genAnswer2);
		//Inheritance and Method Overloading
			System.out.println();
			System.out.println("How many cards are in a standard deck of playing cards?");
			int genAnswer3 = input.nextInt();
			OverloadSub test3 = new OverloadSub();
			test3.answer(genAnswer3);
		//Super Keyword
			System.out.println();
			System.out.println("Type in three numbers (A number can repeat).");
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			int number3 = input.nextInt();
			System.out.println();
			System.out.println("The numbers you selected are: " + number1 + ", " + number2 + ", " + number3 + ".");
			Shape test4 = new Shape(number1, number2, number3);
			System.out.println("The volume of your shape is " + test4.volume());
			System.out.println("What is the area of your shape?");
			int genAnswer4 = input.nextInt();
			if (genAnswer4 == test4.getArea(number1, number2)) {
				System.out.println("Correct");
			}
			else if (genAnswer4 != test4.getArea(number1, number2)) {
				System.out.println("Incorrect. The correct answer is " + test4.getArea(number1, number2));
			}
		//Factorial/Recursion Question
			System.out.println();
			System.out.println("Wow, you got to the final question!");
			System.out.println("Here it is!");
			System.out.print("Enter a number under ten.");
	        int genAnswer5 = input.nextInt();
	        System.out.println();
	        System.out.println("Now find the factorial of it.");
	        System.out.println("Your answer is: ");
	        int genAnswer6 = input.nextInt();
	        System.out.println("Your answer is " + genAnswer6 + "." + " The correct answer to what the factorial of " + genAnswer5 + " is " + Factorial.factorial(genAnswer5));
	        if (genAnswer6 == Factorial.factorial(genAnswer5)) {
	        	System.out.println("You are correct!");
	        }
	        if (genAnswer6 != Factorial.factorial(genAnswer5)) {
	        	System.out.println("You are incorrect!");
	        }
		//Ending Statements
	        System.out.println();
			input.close();
			System.out.println("Thank you for using this program. Goodbye.");
	}
}