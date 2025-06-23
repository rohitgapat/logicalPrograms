package practice.io;

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
		System.out.println(f.findFactorial(5));
	}
}
