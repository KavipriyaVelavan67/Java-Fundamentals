public class Array2{
   public static void main(String[]args){
     
	 int[]arr=new int[5];
	 
	 System.out.println("One Dimensional Array");
	 
	 for(int i=0;i<5;i++){
	 
	     arr[i]=i;
		 System.out.println(arr[i]);
	 }
    
	System.out.println("Two Dimensional Array");
	  
	 int[][]arr1=new int[3][4];
	 
	 for(int i=0;i<3;i++){
		 
		 for(int j=0;j<4;j++){
			 
			 arr1[i][j]=j;
			 System.out.println(arr1[i][j]);
			 
		 }
		 
		 
	 }
	 
	 
	 
	 
   }
}