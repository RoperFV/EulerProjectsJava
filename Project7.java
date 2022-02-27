class Project7 {
	public static void main(String[] args) {
		
		int primeCount = 6;
		
		int num = 15;
		
		for (int i = 1; num > 0; num = num + 2) {
			
			if(isPrime(num)) {
				primeCount = primeCount + 1;
			}
			if(primeCount == 10001) {
				break;
				
			}
			
		}
		System.out.println(num);
		
	}
	
	
	
	
	public static boolean isPrime(int num) {
	boolean p = true;
	for (int i = 3; i<(num/2); i++) {
		if (num%i == 0){
			p = false;
		}
		
	}
	return p;
	}

}