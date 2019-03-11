import java.util.*;

class DistanceAssignment{
	
	public static void main(String []arg){
	
	Distance d1 = new Distance();
	d1.set(3,2.3);
	d1.display();
	Distance d2 = new Distance();
	d2.set(6,3.5);
	d2.display();
	Distance d3 = new Distance();
	d3.addDistance(d1,d2);
	System.out.println("After addition");
	d3.display();
	}

}