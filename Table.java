import java.util.*;
public class Table
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number for which table you want: ");
	  int a=sc.nextInt();
	  
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(i+" * "+a+" = "+i*a);
	  }
  }
}