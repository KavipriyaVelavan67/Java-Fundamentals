public class Array{
    public static void main(String[]args){
     	  
		  int[]arr=new int[]{2,3,4};
		  
		  System.out.println("One Dimensional Array");
		  
		  for(int i=0;i<arr.length;i++){
			  
			  System.out.println(arr[i]);
		  }
		  
		   System.out.println("Two Dimensional Array");
		   
		  int[][]arr1={{2,3,4},{3,4,5}};
		  
		  for(int i=0;i<2;i++){
			  
			  for(int j=0;j<3;j++){
				  
				  System.out.println(arr1[i][j]);
			  }
		  }
   }
}