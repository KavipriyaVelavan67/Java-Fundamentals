import java.util.*;
public class Method1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println(add(a,b));
	System.out.println(sub(a,b));
	System.out.println(multiply(a,b));
	System.out.println(div(a,b));
  }
  
  public static int add(int a,int b)
  {
    return a+b;
  }
  public static int sub(int a,int b)
  {
    return a-b;
  }
  public static int multiply(int a,int b)
  {
    return a*b;
  }
  public static int div(int c,int d)
  {
    return c/d;
  }
  
}