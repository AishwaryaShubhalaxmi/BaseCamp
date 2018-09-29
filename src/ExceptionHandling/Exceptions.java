package ExceptionHandling;
import java.util.*;
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string");    
		//String str= sc.next();
		String str=null;  //Exception case
       validateMobileNo(str);
	}
     static void validateMobileNo(String str1){
    	try{
    		if(str1.length()!=10){
    			System.out.println("False:Invalid mobile number");
   
    		for(int i=0;i<str1.length();i++){
    			if(Character.isDigit(str1.charAt(i)))
    			{continue;}
    			else{
    				System.out.println("False:Invalid mobile number");
    			}
    		}
    		if(str1.charAt(0)!='9'){
    			System.out.println("False:Invalid mobile number");
    		}}else System.out.println("True:valid mobile number");
    	}
    
    	catch(Exception e){
    		System.out.println("Invalid Number");
    	}
}
}
