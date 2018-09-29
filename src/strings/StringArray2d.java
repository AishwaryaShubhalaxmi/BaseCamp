package strings;
import java.util.*;
public class StringArray2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String[][] s=new String[2][3];
       char[][] ch= new char[2][3];
       System.out.println("Enter the elements of array");
       for(int i=0;i<2;i++){
    	   for(int j=0;j<3;j++){
    		   s[i][j]= sc.next();
    	   }
       }
       System.out.println("The array is:");
       for(int i=0;i<2;i++){
    	   System.out.println();
    	   for(int j=0;j<3;j++){
    		   System.out.print(s[i][j] + " ");
    	   }
       }
       for(int i=0;i<2;i++){
    	   for(int j=0;j<3;j++){
    		  ch[i][j]= s[i][j].charAt(0);  
    	   }
    	   
       }
       System.out.println("The required array is");
       for(int i=0;i<2;i++){
    	   System.out.println();
    	   for(int j=0;j<3;j++){
    		   System.out.print(ch[i][j] + " ");
    	   }
	}

}
}
