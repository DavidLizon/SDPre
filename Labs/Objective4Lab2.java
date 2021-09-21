import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please enter the fist whole number.");
    num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number.");
    num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number.");
    num3 = keyboard.nextInt();

    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Please enter the first decimal number.");
    dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number.");
    dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number.");
    dub3 = keyboard.nextDouble();

    //TODO print the three ints and their sum.
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));
  }
}
