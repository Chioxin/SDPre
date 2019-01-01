import java.util.Scanner;

public class ForgetfulMachine {
  public static void main ( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France");
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7" );
    keyboard.nextInt(); //Blew up on 3.4234, because this is an double, not an int.

    System.out.println( "Enter a number between 0.0 and 1.0" );
    keyboard.nextDouble(); //Entered a string value, and it blue up, because this is a double and not a string.

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();
  }
}
