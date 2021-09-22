import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    //Part 1 & 2.
    System.out.println("Please enter one number: ");
    num1 = kb.nextDouble();
    System.out.println("Please enter another number: ");
    num2 = kb.nextDouble();

    while(keepGoing) {
      printMenu();
      System.out.print("Which would yuou like to do? ");
      choice = kb.nextInt();

      switch(choice) {
        case 1:
        answer = findSum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + answer);
        break;
        case 2:
        answer = findAverage(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
        break;
        case 3:
        answer = calcTax(num1, num2);
        System.out.println("The tax on " + num1 + " and " + num2 + " at 8.31% would be: " + answer);
        break;
        case 4:
        System.out.println("You've quit the program. Have a good day!");
        keepGoing = false;
        break;
        default:
        System.out.println("That wan't an option. Please pick again.");
      }
    }

/*
    //Part 4
    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 " is " + averave);
*/

    kb.close();

  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. nextInt         |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }

  public static double findAverage(double x, double y) {
    double calcAvg = (x + y)/2;
    return calcAvg;
  }

  public static double calcTax(double x, double y) {
    double tax = (x + y) * 0.0831;
    return tax;
  }

}
