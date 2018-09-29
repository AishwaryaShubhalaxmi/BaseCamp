package ExceptionHandling;
import java.util.*;
public class ExceptionUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       try{
    	   System.out.println("Enter two integers");
    	   int a,b;
    	   a=Integer.parseInt(sc.next());
    	   b=Integer.parseInt(sc.next());
    	   int d=a/b;
    	   
       }
       catch(ArithmeticException e){
    	   System.out.println("Number cannot be divided by zero");
       }
       catch(NumberFormatException e){
    	   System.out.println("Number Format Exception");
       }
       
           
	}

}
