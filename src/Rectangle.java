import java.util.*;
class Rectangle{
	float l;
	float b;
	Rectangle(float length,float breadth){
	l= length;
	b= breadth;
	}
	public float getArea(){
		return (l*b);
	} 	
	public float getPerimeter(){
		return(2*l+2*b);
	}
}
