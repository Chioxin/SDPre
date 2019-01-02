import java.util.Scanner;

public class Objective4Lab4 {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "Please enter a number: " );
    int n = keyboard.nextInt();

    if (n % 2 == 0) {
      System.out.println( "The number is even.");
    }
    else {
      System.out.println( "The number is odd.");
    }
  }
}
