import java.util.*;

public class ComplexNumber{
	public static void main(String []arg){
	double real;
	double imaginary;

	System.out.println("enter the first complex number");
	Scanner sc = new Scanner(System.in);
	real = sc.nextDouble();
	imaginary = sc.nextDouble();
	Complex obj1 = new Complex();
	obj1.set(real,imaginary);
	obj1.display();

	System.out.println("enter the second complex number");
	real = sc.nextDouble();
	imaginary = sc.nextDouble();
	Complex obj2 = new Complex();
	obj2.set(real,imaginary);
	obj2.display();

	System.out.println("summation of above ");
	
	Complex obj3 = new Complex();
	obj3.sum(obj1,obj2);
	obj3.display();
	
	}
}