import java.lang.Math;

class Project3 {
	public static void main(String[] args) {
		
		long value;
		value = 600851475143l;
		long orig = value;
		long root;
		root = (long)Math.floor((Math.sqrt(value)));
		long prime = 0;
		long lastPrime = 8;

		
		while(prime != 1) {
			
			prime = primes(lastPrime, root);
			lastPrime = prime;
			value = value/lastPrime;
			if (orig%value == 0) {

				break;
				
			}
			root = (long)Math.floor((Math.sqrt(value)));
			
			
		}
		
		
		System.out.println(value);
	}

			
	public static boolean isPrime(long num) {
		boolean p = true;
		for (int i = 2; i<(num/2); i++) {
			if (num%i == 0){
				p = false;
			}
			
		}
		return p;
	}
	public static long primes(long num, long num2) {
		
		for (long i = num; i<num2; i++) {
			
			if (isPrime(i) && num%i==0) {
				return i;
			}
			
		}
		long other = 0;
		return other;
		
	}
}