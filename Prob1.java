import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Give an integer: ");

    int usernum = scan.nextInt();

    if (usernum > 5 && usernum < 76)
      System.out.println("False");
    else
      System.out.println("True");      


  }
  }