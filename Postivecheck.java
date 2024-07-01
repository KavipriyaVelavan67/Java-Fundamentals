import java.util.*;
public class Postivecheck
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Value");
	 int a = sc.nextInt();
     if(a>=0){
	    System.out.println("a is a positive number");
	 }	 
	 else{
	   System.out.print("a is a Negative number");
	 }
  }
}