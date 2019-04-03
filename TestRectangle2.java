import java.util.Scanner;
public class TestRectangle2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int numr = 0;
		System.out.println("Enter the number of rectangles to be created:\n");
		numr = input.nextInt();
		Rectangle[] rectangles = new Rectangle[numr];
		createRectangles(rectangles);
		System.out.println("Here are the rectangles you created:");
		for(int i=0;i<numr;i++) {
			System.out.println("Rectangle "+i+": area:"+rectangles[i].getArea(rectangles[i].length, rectangles[i].width)+"---"+"perimeter: "+rectangles[i].getPerimeter(rectangles[i].length,rectangles[i].width ));
		}
	}
	public static void createRectangles(Rectangle[] array) {
		double length;
		double width;

		Scanner input = new Scanner(System.in);

		
		for (int i = 0; i < array.length; i++) {
		
			System.out.print("Enter the length for rectangle " + (i+1) + ": ");
			length = input.nextDouble();
			System.out.print("Enter the width for rectangle " + (i+1) + ": ");
			width = input.nextDouble();

		
			array[i] = new Rectangle(length,width);
		}
}

}
