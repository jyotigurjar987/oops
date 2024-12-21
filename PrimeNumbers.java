package oops;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 1 and 20 are:");
		for(int i=1;i<=20;i++) {
			if(isPrime(i)) {
				System.out.print(i+"");
			}
		}
	}
public static boolean
isPrime(int num) {
	if(num<=1) {
		return false;
	}
	for(inti=2;i<=Math.sqrt(num);i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}

}
