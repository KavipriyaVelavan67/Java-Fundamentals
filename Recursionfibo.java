import java.util.*;
public class Recursionfibo
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
    for (int i=0;i<num;i++)
	{
		System.out.print(fibo(i)+" ");
	}
  }
  
  public static int fibo(int n)
  {
    if(n==0)
	{
		return 0;
	}
	
    if (n == 1||n == 2)
	{
		return 1;
	}	
	
	 return fibo(n-1)+fibo(n-2);
	
  }
  
}