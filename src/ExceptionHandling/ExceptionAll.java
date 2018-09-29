package ExceptionHandling;
import java.util.*;
public class ExceptionAll {

	public static void main(String[] args){ 
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
   /*   System.out.println("Enter a number");
       try{
    	   int n=sc.nextInt();
    	   System.out.println(++n);
       }
       catch(InputMismatchException e){ 
    	   System.out.println("Invalid input");
         } */
	
	 
      
      System.out.println("Enter a string");
      try{
    	  String s=sc.next();
    	  for(int i=0;i<s.length();i++){
    		  if(Character.isLetter(s.charAt(i))==false){
    			  throw new InputMismatchException();
    		  }
    		  } 
    	       System.out.println(s);
      }catch(InputMismatchException e){
    		  System.out.println("You enterd an invalid input");
    	  }
      
      }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

