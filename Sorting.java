import java.util.*;
public class Sorting{
   public static void main(String[]args){
     
	 int[]arr=new int[]{13,45,2,12,6};
	 
	 System.out.println("Before sorting an array");
		  
		  for(int i=0;i<arr.length;i++){
			  
			  System.out.println(arr[i]);
		  }
		  
		  Arrays.sort(arr);
		  
		  System.out.println("After sorting  array");
		  
		  for(int i=0;i<arr.length;i++){
			  
			  System.out.println(arr[i]);
		  }
	 
	 
	 
   }
}