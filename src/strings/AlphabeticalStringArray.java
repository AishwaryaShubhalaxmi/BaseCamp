package strings;
import java.util.*;
public class AlphabeticalStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of the string");
       int n=sc.nextInt();
       String[] s= new String[n];
      
       System.out.println("Enter the string");
       for(int i=0;i<s.length;i++){
    	   s[i]=sc.next();
       }
       for(int i=0;i<s.length;i++){
    	   for(int j=i+1;j<s.length;j++){
    		   if(s[i].compareTo(s[j])>0){
    			   String temp= s[i];
    			   s[i]=s[j];
    			   s[j]=temp;
    		   }
    	   }
       }
       for(int i=0;i<s.length;i++){
       System.out.println(s[i]);
       }
       
	}

}
