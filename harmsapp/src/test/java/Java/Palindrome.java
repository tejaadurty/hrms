package Java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ----Number Palindrome----//
		int r, sum = 0, tmp;

		int n = 454;
		tmp = n;
		while (n > 0) {
			r = n % 10; // getting reminder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (tmp == sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome");
		}
		
		// ----String Palindrome----//
		
		
		
		
		
	}

}
