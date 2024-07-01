import java.util.*;
public class Scan
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Value");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd Value");
		int b = sc.nextInt();
		int sum = a + b;
		
		System.out.println("sum of 2 values: "+ sum);
		
		System.out.println("Enter the String Value");
		String str = sc.next();
		
		System.out.println("String value "+str);
		
	}
}