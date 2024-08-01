import java.util.Scanner;

class GreatestofTwoNumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers=");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if (num1 > num2) 
    {
      System.out.println(num1 + " is greater than " + num2);
    } 
    else if(num2>num1)
    {
      System.out.println(num2 + " is greater than " + num1);
    }
    else
    {
      System.out.println("Both the numbers are equal");
    }
  }
}