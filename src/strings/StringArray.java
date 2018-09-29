package strings;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int x=0;
      String[] s= new String[n];
      String[] k= new String[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<s.length;i++){
    	  s[i] =sc.next();
    	  
      }
      System.out.println("The original array elements are: ");
      for(int i=0;i<s.length;i++){
    	  System.out.println(s[i]);
      }
      for(int j=(s.length-1); j>=0;j--){
    	  k[x] = s[j];
    	  x++;
      }
      for(int i=0;i<s.length;i++){
      System.out.print(k[i] + " ");
	}

}
}