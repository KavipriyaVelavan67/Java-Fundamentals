import java.util.*;
public class Arrayofstring{
    public static void main(String[]args){
		
		StringBuilder sb=new StringBuilder();
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