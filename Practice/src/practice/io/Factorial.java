package practice.io;

import java.util.Scanner;

public class Factorial {
	
	public int findFactorial (int num) {
		int x=1;
		while(num!=0) {
			x=x*num;
			num--;
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		Factorial f=new Factorial();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		System.out.println(f.findFactorial(num));
		sc.close();
	}
}
