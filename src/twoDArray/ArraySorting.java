package twoDArray;
import java.util.*;
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
      
       int[][] a=new int[2][3];
       System.out.println("Enter the array elements");
       for(int i=0;i<2;i++){
    	   for(int j=0;j<3;j++){
    		   a[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("The array elements are: ");
       for(int i=0;i<2;i++){
    	       System.out.println();
    	   for(int j=0;j<3;j++){
    		   System.out.print(a[i][j] + " ");
    	   }
       }   
         
   
	
	
	
	
	}

}
