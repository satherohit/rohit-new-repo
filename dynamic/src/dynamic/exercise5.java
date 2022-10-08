package dynamic;

import java.util.Scanner;

public class exercise5 {
double perimeter(double length,double width) {
	double perimeter=2*(length+width);
	return perimeter;
	
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter length");
	double length=sc.nextDouble();
	System.out.println("enter width");
	double width=sc.nextDouble();
	exercise5 aa=new exercise5();
	double perimeter=aa.perimeter(length, width);
	System.out.println("the value of perimeter is:"+perimeter);
	
	
	
}

}
