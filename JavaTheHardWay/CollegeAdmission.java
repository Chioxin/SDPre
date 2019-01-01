import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println( "Welcome to the UT Austin Colleg Admissions Interface!" );
    out.print( "Please enter your SAT math score (200 - 800): " );
    math = keyboard.nextInt();

    out.print( "Admittance status: " );

    if ( math >= 790 )
      out.print( "CERTAIN " );
    else if ( math >= 710 )
      out.print( "SAFE " );
    else if ( math >= 580 )
      out.print( "PROBABLE " );
    else if ( math >= 500 )
      out.print( "UNCERTAIN " );
    else if ( math >= 390 )
      out.print( "UNLIKELY " );
    else // below 390
      out.print( "DENITED " );
    out.println();

    /* Asked to type this out expanded, but only if I didn't trust them.
    I trust them. I know how this works! I didn't type out the rest =P
    SORRY!!!!! */
  }
}
