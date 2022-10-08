package dynamic;

import java.util.Scanner;

public class exercise1 {
		double avg(double sum, double n) {
			double avg=sum/n;
			return avg;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter sum value");
			double sum=sc.nextDouble();
			System.out.println("enter n value");
			double n=sc.nextDouble();
			exercise1 exe=new exercise1();
			 double avg=exe.avg(sum,n);
			 System.out.println("avg of this value is:"+avg);
			
		}
	}


