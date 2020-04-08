package finalProject;

public class Shape extends twoD{
	private int height;  // The cube's height
	public Shape(int length, int width, int number3) {
	   // Call the superclass constructor.
	   super(length, width);
	   // Set height
	   height = number3;
	   System.out.println("The height of your shape is " + height);
	}
	public int volume() {
	   return getArea(twoD.length, twoD.width) * height;
	}
}
