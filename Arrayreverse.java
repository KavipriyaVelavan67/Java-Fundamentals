import java.util.*;
public class Arrayreverse{
    public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		System.out.println("Enter the Values: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Actual Array: ");
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		System.out.println("Reversed Array: ");
		
		for(int i=arr.length-1;i>=0;i--){
			
			System.out.println(arr[i]);
			
		}
	}

}