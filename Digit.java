import java.util.*;
public class Digit
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
	int num=sc.nextInt();
	
	int temp=0;
	int count=0;
	
	while(num>0)
	{
	   int d=num;
	   temp=num%10;
	   num=d/10;
	   count++;
	}
	System.out.print(count);
  }
 
}