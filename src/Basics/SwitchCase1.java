package Basics;
import java.util.*;
class InvalidCharacterException extends Exception{  
	 InvalidCharacterException(char s){  
	  super();  
	 }  
	}  
public class SwitchCase1 {
	public static void test(char ch) throws InvalidCharacterException{
		 if(Character.isLetter(ch)!=true){
			 throw new InvalidCharacterException ("Not a valid character");
		 }
		 else{
			 switch(ch){
		       case ('A'):
		    	 //  System.out.println("Vowel");
		          //  break;
		       case('E'):
		    	  // System.out.println("Vowel");
		    //   break;
		       case('I'):
		    	 //  System.out.println("Vowel");
		      // break;
		       case('O'):
		    	//   System.out.println("Vowel");
		     //  break;
		       case('U'):
		       System.out.println("Vowel");
		       break;
		       default:
		    	   System.out.println("Consonant");}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        char ch1=sc.next().charAt(0);
        char ch= Character.toUpperCase(ch1);
        
        try{
        	test(ch);
        } catch(Exception e){
        	System.out.println("Exception occured");
       
            	 
               		
        	}
        }
        
	}


