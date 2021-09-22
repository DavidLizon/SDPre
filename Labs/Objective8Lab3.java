public class Objective8Lab3 {
  public static void main(String[] args) {

    /* Why add the counter int to the code? Why wouldn't you just initialize the
    variable in the for loop and increment that? That variable, in this case i,
    could used in the nested if/else if to print out the expected outcome.
    */
    int counter = 1;

    for(int i=1; counter<=20; counter++) {
      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else if(counter % 2 == 1) {
        System.out.println(counter + " is odd");
      }
    }
  }
}
