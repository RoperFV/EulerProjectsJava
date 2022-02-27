import java.util.Scanner;

class Project4 {
	public static void main(String[] args) {
		
		
		System.out.println("Enter an integer: ");
		
		Scanner input = new Scanner(System.in);
		
		int inputNum = input.nextInt();
		
		int pal1 = inputNum;
		int pal2 = inputNum;
		int product = 0;
		
		
		int palindrome = 0;
		
		for (int j = pal2; j>0; j--) {
			
			for (int i = pal1; i > 0; i--) {
				product = pal1*pal2;
				
				if (isPal(product) && product > palindrome) {
					palindrome = product;
				}
				pal1 -= 1;
			}
			pal2 -= 1;
			pal1 = pal2;
			
		}
		
		System.out.println("The largest palindrome that is the product of numbers at ");
		System.out.println("or below " + inputNum + " is " + palindrome);
		
	}
	public static boolean isPal(int p){
		String num = String.valueOf(p);
		
		int reverseCounter = num.length() - 1;
		
		boolean even = false;
		if (num.length()%2 == 0) {
			even = true;
		}

		for (int i = 0; i < num.length();i++) {
			
			if (num.charAt(i) == num.charAt(reverseCounter)) {
				
				reverseCounter -= 1;
				if (even && i+2 == reverseCounter && num.charAt(i+1) == num.charAt(reverseCounter)) {
					return true;
				}
				if (!even && i+1 == reverseCounter) {
					return true;
				}

			} else {
				return false;
				
			}
			
		}
		return false;
		
	}


}