package week1.homeassignment;


public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=13;
		if (n<=1) {
			System.out.println(n + " is not Prime number");
			return;
		}
		int count =0;
		for(int i=2;i<=n-1;i++){
		if (n%i==0){
			count++;
		}	
	}
		if (count>0) {
		System.out.println(n + " is not Prime number");
		}
	    else {
		System.out.println(n + " is Prime number");
	    }
	}
	}


