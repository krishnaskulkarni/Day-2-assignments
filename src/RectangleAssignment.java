import java.util.*;

class RectangleAssignment{
	public static void main(String []arg){
		float length;
		float breadth;
		System.out.print("Enter length of the rectangle");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		System.out.print("Enter breadth of the rectangle");
		breadth = sc.nextInt();
		Rectangle object = new Rectangle(length,breadth);
		System.out.println("Area of the rectangle is  "+object.getArea());
		System.out.println("perimeter of the rectangle is  "+object.getPerimeter());
	}
}