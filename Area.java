public class Area{
 public static void main(String[]args){
     
	 Rectangle area = new Rectangle(5,6);
	 Rectangle perimeter = new Rectangle(6,6);
	 
	 System.out.println(area.areaOfRectangle(5,6));
	 System.out.println(perimeter.perimeterOfRectangle(6,6));
 }
}

class Rectangle{
   
   int width;
	int height;
	
	Rectangle(int l,int b){
		
	     this.width  = l;
		 this.height = b;
	}
	
	public int areaOfRectangle(int l,int b){
		
		return l*b;
		
	}
	public int perimeterOfRectangle(int l,int b){
		
		return l+b;
	}
}