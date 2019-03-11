
class Distance{
	int feet;
	double inch;

	public void set(int feet,double inch){
		this.feet = feet;
		this.inch = inch;
	}
	public void display(){
		System.out.println("Distance = "+feet+" feet "+inch+" inch");

	}
	public void addDistance(Distance d1, Distance d2){
		this.feet = d1.feet + d2.feet;
		this.inch = d1.inch + d2.inch;
	}
}