import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two integers: ");

    int num1 = scan.nextInt();

    if (num1 >= 0)
      System.out.println("Both are positive or zero.");
    else 
      System.out.println("One or both are negative.");
  }
  
  }