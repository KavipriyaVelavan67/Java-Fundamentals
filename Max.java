import java.util.*;
public class Max
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter the Values");
	 
	 System.out.println("Enter the 1st Value: ");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter the 2nd Value: ");
	 int b = sc.nextInt();
	 
	 int max=0;
	 
	 switch(a > b? 1:0)
	 {
		 case 1:
		 {
			 max = a;
			 break;
		 }
		 case 2:
		 {
			 max = b;
			 break;
		 }
		 default:
		 {
			 System.out.println("Invalid Input");
			 return;
		 }
	 }
	  
	  System.out.println("Max value: "+ max);
	 
  }
}