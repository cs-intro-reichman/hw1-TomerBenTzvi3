// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	// Generates three integer random numbers in range 1-"random" (the chosen limit range)
		int random = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * random + 1);
		int num2 = Math.min(num1 - 1,num1 - 1);
		int num3 = Math.min(num2 - 1,num2 - 1);
		System.out.print(num1 + " " + num2 + " " + num3);
		System.out.print(num3 + " " + num2 + " " + num1);
	}
}	
