import java.util.*;
public class Palindrome{
	public static void main(String[]args){
	 
		 Scanner sc = new Scanner(System.in);
	     String str=sc.next().toLowerCase();
		 StringBuilder sb=new StringBuilder();
		 
		 //char[]ch=str.toCharArray();
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 sb.append(str.charAt(i));
		 }
		 
		 String s=sb.toString();
		 
		 if(s.equals(str)){
			 
			 System.out.println(str +" is Palindrome");
		 }
		 else{
			  System.out.println(str +"  is not Palindrome");
		 }
		 
		 //System.out.println(sb);
	 }
}