public class Isprime{
   public static void main(String[]args){
     
	  int a = 11;
	  int b = 27;
	  
	   System.out.println(isprime(a));
	   System.out.println(isprime(b));
   }
   
   public static boolean isprime(int n){
   
       if(n==1 || n==0){
	       return false ;
	   }
	   if(n==2){
	       return true ;
	   }
       
	   for(int i=2;i<n/2;i++){
	       
		   if(n%i == 0){
		      
			  return false;
		   }
	   }
	   
	   return true;
   
   }
}