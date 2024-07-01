import java.util.*;
public class Reversestring{
	 public static void main(String[]args){
		 
		 Scanner sc = new Scanner(System.in);
	     String str=sc.next();
		 StringBuilder sb=new StringBuilder();
		 
		 //char[]ch=str.toCharArray();
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 sb.append(str.charAt(i));
		 }
		 
		 System.out.println(sb);
	 }

}