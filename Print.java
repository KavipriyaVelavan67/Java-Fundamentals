import java.util.*;
public class Print
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	double d=sc.nextDouble();
	String str=sc.next();
	
	Print(i);
	Print(d);
	Print(str);
  }
  
  public static void Print(int a)
  {
    System.out.println(a);
  }
   public static void Print(double a)
  {
    System.out.println(a);
  }
   public static void Print(String a)
  {
    System.out.print(a);
  }
  
}