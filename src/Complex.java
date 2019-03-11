import java.util.*;

class Complex{
	double r;
	double i;
	
	public void set(double real,double imaginary){
		r=real;
		i=imaginary;
	}
	public void display(){
		System.out.println("complex number is"+r+" + i"+i);
	}
	public void sum(Complex obj1,Complex obj2){
		r=obj1.r+obj2.r;
		i=obj1.i+obj2.i;
	}
}