package finalProject;

public class twoD {
	protected static int length;
	protected static int width;
	public twoD(int number1, int number2) {
      length = number1;
      width = number2;
      System.out.println("The length of your shape is " + length);
      System.out.println("The width of your shape is " + width);
   }
	public int getArea(int number1, int number2) {
		return number1 * number2;
	}
}