import java.util.*;
public class Occurences{
  public static void main(String[]args){
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=sc.nextInt();
	
	System.out.println("Enter the value:");
	int x=sc.nextInt();
	
	int[]arr=new int[n];
	
	for(int i=0;i<n;i++){
		
		arr[i]=sc.nextInt();
	}
	
	int count=0;
	
	for(int i=0;i<n;i++){
	
	   if(arr[i]==x) {   
	       count++;
		}
	  
	}
	 if(count==0){
			
			System.out.println("The given number is not present in the given array");
		}
	else{	
	   
	   System.out.println("Occurences of the number is: "+count);}
  }
}