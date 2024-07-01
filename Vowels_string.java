import java.util.*;
public class Vowels_string{
    public static void main(String[]args){
       
	   String a = "Kavya";
	   String b = "Navin";
	
	    System.out.println(containing_Vowels(a));
	    System.out.println(containing_Vowels(b));

   }
   public static boolean containing_Vowels(String s){
	   
	  return s.toLowerCase().matches(".*[aeiou].*");
	  
   }
}
