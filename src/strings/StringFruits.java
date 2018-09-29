package strings;
import java.util.*;
class Fruitsname{
	public static void display(){
		 Scanner sc= new Scanner(System.in);
	      System.out.println("Enter the length of the array");
	      int n=sc.nextInt();
	      String[] s= new String[n];
	      String s1="";
	      char[] ch= new char[n];
	      System.out.println("Enter the elements of the array");
	      for(int i=0;i<n;i++){
	    	  s[i]=sc.next();
	      }
	      System.out.println("The string array is:");
	      for(int i=0;i<n;i++){
	    	  System.out.print(s[i] + " ");
	      }
	      System.out.println();
	      System.out.println("The required string is:");
	      for(int i=0; i<s.length;i++){
	    
	    		  s1+= s[i].charAt(0);
	    	  }
	      
	      
	      System.out.println(s1);
	      for(int j=0;j<s1.length();j++){
	    	   ch[j]= s1.charAt(j);
	    	   System.out.print(ch[j] + " ");
	      }
	      
		
	}
}
public class StringFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruitsname.display();
	}

}
