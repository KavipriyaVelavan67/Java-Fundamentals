public class Fibonacci1{
   public static void main(String[]args){
     
	  int count = 8;
	  
	  System.out.println(0+" "+1);
	  fibo(count);
	   
   }
   
   public static void fibo(int n){
	   
	   int a=0;
	   int b=1;
	   int c=0;
	   
	   if(n>0){
		
			c = a+b;
			System.out.println(" "+c);
			a = b;
			b = c;	
			
	        fibo(n-1);
	   }		
		
   }
}