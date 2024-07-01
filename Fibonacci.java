import java.util.*;
public class Fibonacci
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the n value");
	 int num = sc.nextInt();
	 
	 int a=0;
	 int b=1;
	 int c=0;
	 
	 for(int i=0;i<num;i++)
	 {
	   c=a+b;
	   a=b;
	   b=c;
	 }
	 System.out.print(c);
  }
  
}