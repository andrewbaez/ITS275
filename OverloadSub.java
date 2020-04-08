package finalProject;

public class OverloadSub extends Overload {
	//subclass
	public void answer(int genAnswer3) {
		if (genAnswer3 == 52) {
			System.out.println("You're right, a standard deck has 52 cards");
		}
		else if (genAnswer3 != 52) {
			System.out.println("Sorry, but the correct answer is 52.");
		}
	}
}
