// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	// Generates three integer random numbers in range 1-100
		int num1 = (int)(Math.random() * 100 + 1);
		int num2 = (int)(Math.random() * 100 + 1);
		int num3 = (int)(Math.random() * 100 + 1);
		//Prints biggest number
		if (num1 > num2 || num1 > num3) {
			System.out.println(num1);
		}
		else if (num2 > num1 || num2 > num3) {
			System.out.println(num2);
		}
		else if (num3 > num1 || num3 > num2) {
			System.out.println(num3);
		}
		//Prints 2nd biggest number
		if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
			System.out.println(num1);
		}
		else if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
			System.out.println(num2);
		}
		else if (num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2) {
			System.out.println(num3);
		}
		//Prints 3rd biggest number
		if (num1 < num2 || num1 < num3) {
			System.out.println(num1);
		}
		else if (num2 < num1 || num2 < num3) {
			System.out.println(num2);
		}
		else if (num3 > num1 || num3 > num2) {
			System.out.println(num3);
		}
	}
}	
