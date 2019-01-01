import java.util.Scanner;

public class BMICalculator {
  public static void main ( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, in, lb, ft;

    System.out.print( "Your height (Feet Only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (Inches): " );
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();

    m = ((ft * 12) + in) / 39.37; //Formula found on Google

    kg = lb / 2.205; //Formula found on Google

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
