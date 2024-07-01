public class Reverse_String{
   public static void main(String[]args){
   
      System.out.println(reverse("hello"));
   }
   
   public static String reverse(String s){
	
	  StringBuilder out = new StringBuilder();
	
	 for (int i = s.length()-1;i>=0;i--){
		 out.append(s.charAt(i));
	  }
		String k = out.toString();
		
		return k; 
	}

}