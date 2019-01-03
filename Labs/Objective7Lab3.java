import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      int choice;

      printMenu();
      choice = scanner.nextInt();

      if (choice == 1) {
        System.out.println("Hello Human.");
      }
      else if (choice == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if (choice == 3) {
        System.out.println("Goodbye.");
        break;
      }
      else {
        System.out.println ("ERROR");
      }
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println(" _____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
