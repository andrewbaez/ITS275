package finalProject;
//The basic template was imported from https://github.com/DrGMC/DrGMC-Recursion/blob/master/Factorial

public class Factorial {
	static int factorial(int number) {
        if (number == 0)
            return 1;
        else
            return number * factorial(number - 1);
    }
}