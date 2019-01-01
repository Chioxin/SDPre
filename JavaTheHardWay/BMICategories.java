import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double bmi, ft, in, lb, kg, m;

    System.out.print( "How tall are you? (JUST FEET): ");
    ft = keyboard.nextDouble();
    System.out.print( "And Inches? " );
    in = keyboard.nextDouble();

    in = in + (ft * 12);
    m = in/39.37;

    System.out.print( "How much do you weigh in pounds? " );
    lb = keyboard.nextDouble();

    kg = lb/2.205;
    bmi = kg/(m*m);

    //System.out.print( "Enter your BMI: " );
    //bmi = keyboard.nextDouble();

    System.out.print( "With a BMI of " + bmi + ", your category is: ");
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40 ) {
      System.out.println( "severerly obese" );
    }
    else {
      System.out.println( "very severely/ \"morbidly\" obese" );
    }
  }
}
