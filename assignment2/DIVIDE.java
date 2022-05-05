import java.util.Scanner;

class DIVIDE{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner (System.in);
    System.out.print("enter the first number: ");
    int a = sc.nextInt();
    System.out.print("enter the second number: ");
    int b = sc.nextInt();
    int d = (a/b);
    System.out.println();
    System.out.println("The division of a and b is:" +d);
  }
}