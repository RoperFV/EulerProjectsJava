class Project6 {
	public static void main(String[] args) {
		
		long sum = 0;
		long squares = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			squares = squares + i*i;
			
			sum = sum + i;
			
		}
		sum = sum*sum;
		long diff = sum - squares;
		System.out.println(squares);
		System.out.println(sum);
		System.out.println("The difference is " + diff + ".");
		
		
	}


}