import java.util.*;
public class Occurencesofstring{
	 public static void main(String[]args){
		 
		 Scanner sc = new Scanner(System.in);
	     String str=sc.next();
	     char spl=sc.next().charAt(0);
		 
		 char[]ch=str.toCharArray();
		 
	     int count=0;
		 for(int i=0;i<ch.length;i++){
	      
		  if(ch[i] == spl){
			  
		    count++;
	       }
		}		 
		 
		 System.out.println(count);
	 }

}