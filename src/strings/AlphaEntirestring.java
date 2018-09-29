package strings;
import java.util.*;
public class AlphaEntirestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=sc.nextInt();
     String[] s= new String[n];
     String s2="";
    
     System.out.println("Enter the string");
     for(int i=0;i<s.length;i++){
    	 s[i]=sc.next();
     }
       String s1=s.toString();
       char[] ch= new char[s1.length()];
       
       for(int i=0;i<s1.length();i++){
          ch[i]=s1.charAt(i);
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
     			s2+=ch[j];}
     		 System.out.println(s);
     	 
       }
    	 
     }
	


