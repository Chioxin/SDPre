import java.util.Scanner;

public class RunningTotal {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a 0.");

/* All of the code in this comment, makes it a while loop.
   Do-While loops are far better for this.

    System.out.print("Value: ");
    current = keyboard.nextInt();
    System.out.prinln("The total so far is: " + total);

    while (current != 0) {
        System.out.print("Value: ");
        current = keyboard.nextInt();
        total += current;
        System.out.println("The total so far is: " + total);
    }
*/
    do {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;
      if (current != 0) {
        System.out.println("The total so far is: " + total);
      }
    } while ( current != 0 );

    System.out.println("The final total is: " + total);
  }
}
