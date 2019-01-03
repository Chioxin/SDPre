import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry, pinFlag = 0, passFlag = 0;
    String password = "userlogin", input;

    System.out.println( "WELCOME TO THE BANK OF JAVA" );
    System.out.print( "WHAT IS YOUR PASSWORD: (HINT: userlogin): " );
    input = keyboard.next();

    while ( ! input.equals(password) ) {
      passFlag++;
      System.out.println( "\nWELCOME TO THE BANK OF JAVA" );
      System.out.print( "INCORRECT! WHAT IS YOUR PASSWORD: (HINT: userlogin): ");
      input = keyboard.next();
    }

    pin = 12345;

    System.out.println( "\nWELCOME TO THE BANK OF JAVA." );
    System.out.print( "ENTER YOUR PIN: " );
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      pinFlag++;
      System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
      System.out.print( "ENTER YOUR PIN: " );
      entry = keyboard.nextInt();
    }
    if (pinFlag > 3 || passFlag > 3 ) {
      System.out.println( "\nSUSPICIOUS ACTIVITY DETECTED" );
      System.out.println( "AUTHORITIES HAVE BEEN NOTIFIED" );
      System.out.println( "NICE TRY!");
    }
    else {
    System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17" );
    }
  }
}
