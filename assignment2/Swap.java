import java.util.Scanner;
class Swap{
public static void main(String[] args)
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("enter x value= ");
x=sc.nextInt();
System.out.println("enter y value= ");
y=sc.nextInt();
System.out.println("Befor swapping x= "+x+ " y="+y);
z=x;
x=y;
y=z;
System.out.println("After swapping x ="+x+ " y="+y);
System.out.println();
}
}