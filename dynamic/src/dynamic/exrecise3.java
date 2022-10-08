package dynamic;

import java.security.DomainCombiner;
import java.util.Scanner;

public class exrecise3 {
	int sum() {
		
		return sum();
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("enter vale a");
		int a=sc.nextInt();
		System.out.println("value of h");
		char ch=sc.next().charAt(0);
		exrecise3 exe=new exrecise3();
		int sum=exe.sum();
		sum=a+ch;
		System.out.println("print sum vale is:"+sum);
		}catch(Exception e) {
			System.out.println("im catch");
		}
		
		
	}

}
