public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 1;
    int counterSum = 0;

    while(counter <= 20) {
      counterSum = counterSum + counter;

      counter += 1;
    }

    System.out.println(counterSum);
  }
}
