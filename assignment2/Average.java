import java.util.Scanner;

class Average{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner (System.in);
    System.out.print("enter the first number: ");
    double a = sc.nextDouble();
    System.out.print("enter the second number: ");
    double b = sc.nextDouble();
	System.out.println("enter the third number: ");
	double c =sc.nextDouble();
	double average=(a+b+c)/3;
    System.out.println();
    System.out.println("The average of a and b and c is:" +average);
  }
}