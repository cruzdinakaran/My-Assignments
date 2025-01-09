package week1.homeassignment;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci series");
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;b<=8;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
