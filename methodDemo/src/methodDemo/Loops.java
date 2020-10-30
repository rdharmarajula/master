package methodDemo;

public class Loops {
	public static void main (String args[]) {
		
		/* simple while loop
		int i = 1;
		while (i<=5) {
			System.out.println("values is " + i);
			i++;
		}
		
		// do while loop
		// now the values of i is 6
		do {
			System.out.println("do while executes atlease one time" + i);
		}while (i<=5);
		
		// for loop : when you know the initial values and number of executes then go for for loop
		
		for(int j=0;j<=5;j++) {
			System.out.println("this is from for loop "+ j);
		}
		*/
		
		/*
		 * print the pattern
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		
		for (int i =0;i<=5;i++) {
			for (int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println(' ');
		}
	 }

}
