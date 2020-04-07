package finalProject;

public class Age {
	int age;	
	
	public void setAge(int age) {
	//this keyword
	this.age = age;
	}
	public void showAge() {
		System.out.println("You have given that your age is " + this.age + ".");
		//Conditional operator
		String dependent = (age >= 18) ? "independent": "dependent";
		System.out.println("Based on your answer, you are declared a(n) " + dependent + ".");
		}
	}