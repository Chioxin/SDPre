import java.util.Scanner;

public class Objective3Lab5 {
  public static void main( String[] args ) {
    Double d1, d2, sum;

    Scanner input = new Scanner(System.in);

    System.out.println( "Please enter a number:");
    d1 = input.nextDouble();
    System.out.println( "Please enter another number:");
    d2 = input.nextDouble();

    sum = d1 + d2;

    System.out.println( "The sum of " + d1 + " + " + d2 + " = " + sum );
    input.close();
  }
}
