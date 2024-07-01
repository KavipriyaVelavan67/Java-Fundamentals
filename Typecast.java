public class Typecast
{
  public static void main(String[]args)
  {
    byte b = 21;
    int a  = b;
	int k  = 99;
	
	byte h = (byte)k;
	long l = k;
	System.out.println(b+k);
	
	long m = 1000;
	int lo = (int)m;
	System.out.println(lo);
	
	float f = 78f ;
	double db = f;
	System.out.println(db);
	
	double d = 90.99;
	float fs = (float)d;
	
	System.out.println(f+d);
	
	
	
	
  }
}
