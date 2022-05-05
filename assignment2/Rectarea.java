import java.util.Scanner;
class Rectarea
{
public static void main(String[] args)
{
double width,height,area, perimeter;
Scanner sc=new Scanner(System.in);
System.out.println("Enter width= ");
width=sc.nextDouble();
System.out.println("Enter height= ");
height=sc.nextDouble();
area=width*height;
perimeter=2*(width+height);
System.out.println("area of rectangle is  = "+area);
System.out.println("area of perimeter is  = "+perimeter);
}
}