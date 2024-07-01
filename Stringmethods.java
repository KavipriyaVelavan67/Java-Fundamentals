public class Stringmethods{
	public static void main(String[]args){
		
		//string litrels
		
		String str = "Kavya";
		String str1 = new String("Navin");
		
		String r = "The World of War";
		
		//String Methods
		
		//length
		int a=str.length();
		System.out.println(a);
		
		//substring
		String output=r.substring(4);
		System.out.println("substring"+output);
		
		//concat
		System.out.println(str.concat(str1));
		
		//indexof
		System.out.println("index value of: "+r.indexOf("World"));
		
		//int indexof = provide the string postion in a sentence and finding the index value
		String s = " Learn Share Learn ";
        int out = s.indexOf("re",2);
		System.out.println("Int index value: "+out);
		
		//last indexOf if the given value is not in the string it will print -1 as the index value
		System.out.println("index value of: "+s.indexOf("a"));
		System.out.println("index value of: "+s.indexOf("p"));
        
		//booleanequals
		String n="hello";
		String k="Hello";
		
		System.out.println(n.equals(k));//false
		System.out.println(n.equals("Hello"));//true
		
		//boolean equalsIgnorecase
        System.out.println(n.equalsIgnoreCase(k));//true
		System.out.println(n.equalsIgnoreCase("Hello"));//true
		
		//int compareTo
		String s1 = "p";
		String s2 = "priya";
		System.out.println("Checking Equality"+s1.compareTo(s2));
        
		//int compareToIgnorecase
		System.out.println("Checking Equality"+k.compareToIgnoreCase(n));
		
		//tolowercase
		System.out.println("Changing to lower Case "+str.toLowerCase());
		
		//touppercase
		System.out.println("Changing to UPPER Case "+str1.toUpperCase());
		
		//trim
		System.out.println(s);
		System.out.println("Trimming: " +s.trim());
		
		//replace
		System.out.println("Replacing a char in string: " + str1.replace('N','K'));
		
		//contain
		System.out.println("check the contain value: "+ s.contains("World"));
		System.out.println("check the contain value: "+ s.contains("Learn"));
		
		//charArray
		System.out.println(s2.toCharArray());
		
		//startswith
		
		String p1="Hello World";
        String p2="Hello";
        System.out.print(p1.startsWith(p2)) ;// return true
	}
}