import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Where do you want to start?");
		int startnumber = reader.nextInt(); // Scans the next token of the input as an int.
		
		System.out.println("Where do you want to stop?");
		int stopnumber = reader.nextInt();
		
		System.out.println(startnumber);
		System.out.println(stopnumber);
		
		int initial = startnumber; //for end result
		
		long startTime = System.currentTimeMillis();
		int primenumbers = 0;
		while (startnumber < stopnumber) {
			int counter = 2;
			int primenumbercounter = 0;
			while (counter < startnumber) {
				if (startnumber % counter != 0) {
					primenumbercounter++;
				}
				else {
				//	System.out.println("broken");
					break;
				}
				counter++;
			}
			if (primenumbercounter == (startnumber - 2)) {
				System.out.println(startnumber + " is prime");
				primenumbers++;
			}			//2255 //17755
			startnumber++;
			
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println( "It took " + elapsedTime + " Miliseconds" + " to find " + primenumbers + " prime numbers" + " between " + initial + " and " + stopnumber);
	}
}
	