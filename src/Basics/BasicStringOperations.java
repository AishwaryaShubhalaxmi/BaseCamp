package Basics;
import java.util.*;
public class BasicStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      // Reverse a string
      System.out.println("Enter a string");
      String s= sc.next();
      String s1="";
      String s2="";
      for(int i=s.length()-1;i>=0;i--){
    	  s1+=s.charAt(i);
    	 }
      System.out.println(s1);
      // Convert all characters to upper case 
      for(int i=0; i<s.length();i++){
      if(s.charAt(i)>=97 && s.charAt(i)<=122){
    	  s2+=(char)(s.charAt(i)-32);      
      }
	}
    System.out.println(s2);
}
}
