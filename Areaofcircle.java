public class Areaofcircle{
     public static void main(String[]args){
	 
	 Circle.pi=3.14;
 
	 Circle c1 = new Circle(6);
	 Circle c2 = new Circle(7);
	 
	 System.out.println(c1.area());
	 System.out.println(c2.perimeter());
	 
	 
	 
	 }
}

class Circle{
	
    double radius;
	static double pi;
	
	Circle(double radius){
		
         this.radius = radius;
	}
	
	public double area(){
		
		return 2 * pi * radius;
	}
	public double perimeter(){
		
		return pi* radius * radius;
	}
	
	
	
}