public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, months;
    double seconds, e, checking, income;
    String firstName, lastName, title, streamname, streamlink;

    x = 10;
    y = 400;
    age = 39;
    months = 5;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    income = 588.18;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    streamname = "chioxinvalderin";
    streamlink = "www.twitch.tv/chioxinvalderin";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "I've been streaming on Twitch for " + months + " and I've made $" + income + " so far.");
    System.out.println( "My twitch handle is " + streamname + ", and I can be found at " + streamlink + " if it interests you!");
  }
}
