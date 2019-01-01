public class ClubBouncer {
  public static void main( String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8 )) {
      System.out.println( "You are allowed to enter the club." );
    }
    //System.out.println( "C-C-C-Combo Breaker!");
    //The above doesn't work, because compiler doesn't know what the "else" is for after this line. It barfs at that point.
    else {
      System.out.println( "You are not allowed to enter the club." );
    }
  }
}
