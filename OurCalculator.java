import java.util.Scanner;
public class OurCalculator{
  public static void main(String []args){


      double num1, num2, num3;
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter first number: ");
      num1 = scan.nextDouble();

      System.out.print("Enter second number: ");
      num2 = scan.nextDouble();

      System.out.print("Enter third number or 0 to skip: ");
      num3 = scan.nextDouble();

      System.out.print("Choose between(+,-,*,/): ");
      char operator = scan.next().charAt(0);

      double output;


  }
}
