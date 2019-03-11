import java.util.*;

class TimeAssignment{
	
	public static void main(String []arg){
		
		Time t1 = new Time();
		t1.setTime(6,3);
		t1.showTime();
		Time t2 = new Time();
		t2.setTime(4,39);
		t2.showTime();
		Time t3 = new Time();
		t3.addTime(t1,t2);
		System.out.println("after addition");
		t3.showTime();
	}
}