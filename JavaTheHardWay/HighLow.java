import java.util.Scanner;

public class HighLow {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)( 100*Math.random() );

    System.out.println( "I'm thinking of a number between 1 - 100. " );
    System.out.println( "Try to guess it!" );
    System.out.print( "> " );
    guess = keyboard.nextInt();

    boolean firstTime = false;
    while ( guess < 1 || guess > 100 ) {
      if (!firstTime) {
        System.out.println( "You're not that great at this game are you?" );
        firstTime = true;
      }
      else {
        double r = Math.random();
        if ( r < .3333333 ) {
          System.out.println( "This game is a lot more fun with my pet rock." );
        }
        else if ( r < .6666667 ) {
          System.out.println( "Are you even reading the instructions?" );
        }
        else {
          System.out.println( "What rock do you live under, again?" );
        }
      }
      System.out.println( "A number BETWEEN 1, AND 100." );
      System.out.println( "Try again, and pay attention!" );
      System.out.print( "> " );
      guess = keyboard.nextInt();
    }

    while ( secret != guess ) {
      if (guess < secret ) {
        System.out.print( "Sorry, your guess is to low." );
      }
      if (guess > secret ) {
        System.out.print( "Sorry, your guess is to high." );
      }
      System.out.print( " Try again. \n " );
      guess = keyboard.nextInt();

    }

    System.out.println( "You guessed it! What are the odds?!?");
  }
}
