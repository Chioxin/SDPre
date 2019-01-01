import java.util.Scanner;

public class RudeQuestions {
  public static void main ( String[] args ) {
    String name, fun;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? ");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.print( "Was this excersise any fun? " );
    fun = keyboard.next();
    System.out.println( fun + ", you are a lemming. Sorry, my humor makes no sense!" );

    //Drill 1 - No it doesn't blow up.
    //Drill 2 - No, because numbers can be string values! Interstate 25, for example.
    //Drill 3 - Int blows up on anything with a decimal in it. Or letters
    //          Double blows up on an letters added in.
    //          String... Anything and everything can be a string? I can't find anything, tried a few things.
  }
}
