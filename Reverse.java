import java.util.*;
public class Reverse
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the value: ");
	int n= sc.nextInt();
	
	for(int i=n;i>=1;i--)
	{
		System.out.println(i);
	}	
	
  }
}