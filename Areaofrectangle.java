import java.util.*;
public class Areaofrectangle
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Arae of Rectangle"+ Area(l,b));
	
  }
  public static int Area(int l,int b)
  {
     return l*b;
  }
 
}