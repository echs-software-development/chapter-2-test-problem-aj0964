import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter 1st interger:");
  int num1 = scan.nextInt();
  System.out.println("Enter 2nd interger:");
  double num2 = scan.nextDouble();
  double avg = (num1 + num2) /2;
  System.out.print("Your average is: " + avg);

  
  }
}