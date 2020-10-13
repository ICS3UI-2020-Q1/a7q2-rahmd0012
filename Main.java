import java.util.Scanner;
/**
 * a program the finds out the numbers that divide without a remainder from a user entered number
 * @author Daniel Rahmani
 */
public class Main {

  public static void factors(int n){
    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        System.out.println(i);
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // tell the user the numbers that divide with no remainder
    System.out.println("Please enter a number to find the factors of");
    int n = input.nextInt();
    factors(n);
    
  }
}
