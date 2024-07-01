public class Swapping{
   public static void main(String[]args){
       
	   int a = 20;
	   int b = 30;
	
	   swap(a,b);

   }
   public static void swap(int a, int b){
	   
	   a = a-b;
	   b = a+b;
	   a = b-a;
	  
	  System.out.println("a = "+a);
	  System.out.println("b = "+b);
	  
   }
}