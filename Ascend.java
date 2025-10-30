// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	// Generates three integer random numbers in range [0-lim) (the chosen limit range)
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * lim);
		int num2 = (int)(Math.random() * lim);
		int num3 = (int)(Math.random() * lim);
	// Chooses the numbers by acending order and prints them
		int highest,mid,lowest;
		highest = Math.max(num1, num2);
		highest = Math.max(highest,num3);
		mid = Math.min(num1,Math.max(num2,num3));
		mid = Math.max(Math.min(mid,num1),Math.min(num2,num3));
		lowest = Math.min(num1, num2);
		lowest = Math.min(lowest, num3);
		System.out.println(highest + " " + mid + " " + lowest);
		System.out.println(lowest + " " + mid + " " + highest);
	}
}	
