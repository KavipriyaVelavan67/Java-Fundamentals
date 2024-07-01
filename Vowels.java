import java.util.*;
public class Vowels
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Please Enter the Alphabet");
	  char c = sc.next().charAt(0);
	  
	  switch (c){
		  
		  case 'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u':
		  
		  System.out.println("Given alphabet is a vowel");
		  break;
		  
		  default:
		  {
			  System.out.println("Given alphabet is a Consonant");
		      break;
		  }
	  }
	  
  }
}