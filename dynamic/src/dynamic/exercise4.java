package dynamic;

import java.util.Scanner;

public class exercise4 {
double circumference(double r) {
double circumference= 3.14*r*r;
return circumference;
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter value r");
	double r=sc.nextDouble();
	exercise4 aa=new exercise4();
	double circumfernce=aa.circumference(r);
	System.out.println("circumference is:"+circumfernce);
}
}
