public class Objective6Lab2 {
  public static void main( String[] args ) {
    int counter = 0;

    while(counter <= 20) {
      counter++;

      /*
      The below if statement was added to satisfy the
      "expected output" of the objective6Lab2 parameters,
      which do not match the description of
      "Print the values 0 -> 20" listed in the description.
      I wasn't sure which target to hit in this case.
      */
      
      if (counter <= 20) {
        System.out.println(counter);
      }
    }
  }
}
