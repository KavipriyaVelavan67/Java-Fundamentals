import java.util.*;
public class Arrayofstringbuffer{
    public static void main(String[]args){
		
		StringBuffer sb=new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		String[]arr=new String[n];
		
		for(int i=0;i<n;i++){
			
			arr[i]=sc.next();
			sb.append(arr[i]);
		}
	
		System.out.println(sb);
		
	}
}