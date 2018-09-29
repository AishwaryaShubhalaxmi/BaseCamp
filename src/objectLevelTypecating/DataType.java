package objectLevelTypecating;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte b=2;    //Implicit Type casting
      short s=b;
      int i=s;
      long l= i;
      float f=l;
      double d=f;
	 System.out.println("Byte value is: " + b);
	 System.out.println("short value is: " + s);
	 System.out.println("int value is: " + i);
	 System.out.println("long value is: " + l);
	 System.out.println("float value is: " + f);
	 System.out.println("double value is: " + d);
     
	 //Explicit Type casting
	 double d1=5.0;
	 float f1=(float) d1;
	 long l1= (long) f1;
	 int i1=(int) l1;
	 short s1=(short) i1;
	 byte b1=(byte) s1;
	 System.out.println("Byte value is: " + b1);
	 System.out.println("short value is: " + s1);
	 System.out.println("int value is: " + i1);
	 System.out.println("long value is: " + l1);
	 System.out.println("float value is: " + f1);
	 System.out.println("double value is: " + d1);
	}
}
