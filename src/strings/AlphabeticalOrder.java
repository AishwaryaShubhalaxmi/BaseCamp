package strings;
import java.util.*;
public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String s=sc.next();
      char[] ch= new char[s.length()];
     
      for(int i=0;i<s.length();i++){
         ch[i]=s.charAt(i);
      }
    	 for(int i=0;i<ch.length;i++){
    		 for(int j=i+1;j<ch.length;j++){
    	
    		 if(ch[i]>ch[j]){
    			 char temp= ch[i];
    			 ch[i]=ch[j];
    			 ch[j]=temp;
    		 }
    	 }
    	 }
    		 for(int j=0;j<ch.length;j++){
    		 System.out.println(ch[j]);
    	 
      }
	}
}
	





