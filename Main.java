import java.util.Scanner;

/**
 *To convert a temperature from Celsius to Fahrenheit
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner to use input
    Scanner input = new Scanner(System.in);

    //ask the user for an amount of degrees celsius
    System.out.println("Enter a temperature to convert in degrees celsius");

    // Allow the user to enter degrees celsius
    int celsius = input.nextInt();

    //Calculates the user's temperature from celsius to fahrenheit
    int fahrenheit = (celsius*9)/5+32;
    
    //Displays the farhenhiet conversion
    System.out.println(celsius + " in celsius is the same as " + fahrenheit + " in fahrenheit");
    
  }
}
