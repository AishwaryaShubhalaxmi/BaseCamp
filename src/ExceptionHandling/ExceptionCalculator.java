package ExceptionHandling;
import java.util.*;
 class Calculator{
 static	public int add(int a,int b){
		return a+b;
	}
 static	public int subtract(int a, int b){
		return a-b;
	}
 static	public int multiply(int a,int b){
		return a*b;
	}
	
 static	public int divide(int a,int b){
	 try{
	    if(b==0)
	    	throw new ArithmeticException();
	    

	}catch(ArithmeticException e){
		System.out.println("Cannot divide by zero");
	}
	 return a/b;
 }
}
	

public class ExceptionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a");
      int a= sc.nextInt();
      System.out.println("Enter the value of b");
      int b=sc.nextInt();
    int sum= Calculator.add(a, b);
    System.out.println(sum);
    int diff=  Calculator.subtract(a, b);
    System.out.println(diff);
     int product= Calculator.multiply(a, b);
     System.out.println(product);
     int quotient= Calculator.divide(a, b);
	}

}
