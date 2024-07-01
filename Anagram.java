import java.util.*;
public class Anagram{
	 public static void main(String[]args){
		 
		 Scanner sc = new Scanner(System.in);
	     String s1=sc.next().toUpperCase();
	     String s2=sc.next().toUpperCase();
		 
		
		 char[]ch1=s1.toCharArray();
		 char[]ch2=s2.toCharArray();
		 
		 int n1= s1.length();
		 int n2= s2.length();
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		if(n1==n2){
			
				if(Arrays.equals(ch1,ch2)){
					
					System.out.println(s1+" and "+s2+" are Anagrams");
				}
				else{
					System.out.println(s1+" and "+s2+" are not Anagrams");
				}
			
		      }
		else{
					System.out.println(s1+" and "+s2+" are not Anagrams");
				}
	 }

}