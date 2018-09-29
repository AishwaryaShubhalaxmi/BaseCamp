package Basics;

public class Variables { 
	int m=50; //instance variable
    static int n=100; //static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //byte,short and long initialization is same
		float b= (float) 10.0;
		float k=10.0f; //default is double
		char c='A';
		double d= 11.56;
		boolean e=true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		// System.out.println(m); //Instance variable cannot be used inside a method
		System.out.println(n);
		System.out.println(k);
	}

}
