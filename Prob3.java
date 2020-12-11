import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a weight in pounds: ");
    
    // Prompt the user to enter weight in pounds
    double weight = scan.nextDouble();

    System.out.println("Enter height in inches: ");
    // Prompt the user to enter height in inches
    double height = scan.nextDouble();

    
    //Constant
    final double KILOGRAMS_PER_POUND = 0.45359237; 
    final double METERS_PER_INCH = 0.0254; 
    
    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double BMI = weightInKilograms/(heightInMeters * heightInMeters);

    // Display result using if, else if and else
    if (BMI < 10.5)
      System.out.println("Your BMI is underweight.");
    else if (BMI < 25.0 && BMI > 10.5)
      System.out.println("Your BMI is normal.");
    else if (BMI < 30.0 && BMI > 25.0)
      System.out.println("Your BMI is overweight.");
    else 
      System.out.println("Your BMI is obese.");
   
  }
}