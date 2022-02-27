class Project2 {
	public static void main(String[] args) {
		int fibOne;
		int fibTwo;
		int fibSequence;
		fibSequence = 3;
		fibOne = 1;
		fibTwo = 2;
		int sum;
		sum = 2;
		
		while (fibSequence<4000000) {
			
			fibSequence = fibOne + fibTwo;
			if ( fibSequence%2 == 0) {
				sum = sum + fibSequence;
			}
			fibOne = fibTwo;
			fibTwo = fibSequence;
			
		}
		System.out.println(sum);
	}
}
			
		
		