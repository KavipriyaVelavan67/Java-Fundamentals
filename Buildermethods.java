import java.util.*;
public class Buildermethods{
   public static void main(String[]args){
   
      Scanner sc = new Scanner(System.in);
	  
	  StringBuilder str = new StringBuilder("Hello");
	  str.append("World");
	  System.out.println(str);
	  
      StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
	  System.out.println(str1.toString());
	  
	  StringBuilder str2 = new StringBuilder("Hello");
      System.out.println("String2 capacity = " + str2.capacity());
	  
	  
      
   
   }
}