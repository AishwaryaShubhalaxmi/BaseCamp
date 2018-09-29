package strings;
import java.util.*;
public class ReverseEntireString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int x=0;
		String[] s= new String[n];
		String[] rev= new String[n];
		// String[] s1= new String[n];
		String s1="";
		System.out.println("Enter the array elements");
		for(int i=0;i<s.length;i++){
			s[i] = sc.next(); //we have a string eg. my name is aish
		}
		for(int i=(s.length-1);i>=0;i--){
			
				rev[x]=s[i];
				x++;
					
			}
		for(int i=0;i<x;i++){
		
			 for(int j=(rev[i].length()-1);j>=0;j--){
		    	  s1+=(rev[i].charAt(j));
		    	 }
			
		}
		
		System.out.print(s1);
		
		

}
}

