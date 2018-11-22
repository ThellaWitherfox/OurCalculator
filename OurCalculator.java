import java.util.scanner;
import java lang.NumberFormatException;

public class OurCalculator{
  public static void main(String []args){
//mjau för att se om mr sippish kan komma åt och läsa mina saker jag lägger
//in
if (num3 == 0) {
    switch(operator) {
      case '+':
      output = num1 + num2;
      break;

      case '-':
      output = num1 - num2;
      break;

      case '*':
      output = num1 * num2;
      break;

      case '/':
      output = num1 / num2;
      break;

      default:
        System.out.printf("You have entered the wrong operator");
      return;
      }
    System.out.println(num1+" "+operator+" "+num2+" = "+output);
  }
}
  }
