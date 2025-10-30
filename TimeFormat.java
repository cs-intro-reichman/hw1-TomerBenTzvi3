// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // midnight time
		if (minutes == 0 || hours == 0 || hours == 24) {
			if (hours > 12 && hours < 24 && hours != 0) {
				System.out.println(hours + ":" + "00" + "PM");
			}
			else if (hours <= 12 || hours == 0) {
				System.out.println(hours + ":" + "00");
			}
		}
		//gives the time AM/PM format
		else if (hours <= 12 && minutes >= 10) {
			System.out.println(hours + ":" + minutes + " AM");
		}
		else if (hours > 12 && hours < 24 && minutes >= 10) {
			System.out.println((hours - 12) + ":" + minutes + " PM");
		}
		// A condition where the minutes number are below 10
		if (minutes < 10 && minutes >= 00) {
		 	if (hours <= 12) {
			System.out.println(hours + ":" + "0" + minutes + " AM");
			}
			if (hours > 12 && hours < 24) {
				System.out.println(hours + ":" + "0" + minutes + "PM");
			}
		}
		// an error statement where the user gives outranged input
		else if (hours > 24 || minutes > 59) {
			System.out.println("error, time in minutes should be 0 to 59, time in hours should be 0 to 23");
		}
	}
}