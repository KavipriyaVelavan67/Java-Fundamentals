=import java.util.*;
public class Range
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your value");
	int num=sc.nextInt();
	
	int max = 100;
	int min = 0;
	
	int range=0;
	
	if(num>max||num<min){
	    System.out.println("The given number is not in the range");
	}
	else{
	   range=max-min;
	   System.out.print("The range Value of given number is "+ range);
	}
	
	
  }
}