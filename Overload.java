package finalProject;

public class Overload {
	//Superclass
	public void answer(double genAnswer3) {
		if (genAnswer3 == 52) {
			System.out.println("You're right, a standard deck has 52 cards");
		}
		else if (genAnswer3 != 52) {
			System.out.println("Sorry, but the correct answer is 52.");
		}
	}
}
