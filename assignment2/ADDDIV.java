import java.util.Scanner;
class ADDD
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Input first number =");
			int n1= sc.nextInt();
			
			System.out.println("Input second number =");
			int n2= sc.nextInt();
			
			int a= n1+n2;
			int b= n1-n2;
			int c= n1*n2;
			int d= n1/n2;
			int e= n1%n2;
			
			System.out.println(n1+ "+" +n2+ "=" +a);
			System.out.println(n1+ "-" +n2+ "=" +b);
			System.out.println(n1+ "*" +n2+ "=" +c);
			System.out.println(n1+ "/" +n2+ "=" +d);	
			System.out.println(n1+ "MOD" +n2+ "=" +e);
			
		}
}