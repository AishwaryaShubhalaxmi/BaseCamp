package Basics;
import java.util.*;
public class stringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aishwarya"; //declaration of a string using String literal
		String s1=new String ("Aishwarya"); //using new keyword
		String s2= "Aishwarya";
		//convert character array to string
		char[] ch={'A','I','S','H'};
		String s3= new String(ch);
		// convert string to character array
		String s4="Welcome";
		char[] c1= s4.toCharArray();
		for(int i=0;i<s4.length();i++){
			System.out.println(c1[i] + " ");
		}
        //without using inbuilt function
		String s5="Mindtree";
		char[] c2= new char[s5.length()];
		for(int i=0;i<s5.length();i++)
		{
			c2[i]=s5.charAt(i); 		
			} 
		for(int i=0;i<s5.length();i++){
			System.out.println(c2[i] + " ");
		}
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		System.out.println(s.equals(s2)); 
	} 
	

}
