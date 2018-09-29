package twoDArray;
import java.util.*;
public class PrintingTheElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of rows");
      int r=sc.nextInt();
      System.out.println("enter the number of columns");
      int c=sc.nextInt();
      int arr[][]=new int[r][c];
      System.out.println("Enter the array elements");
      for( i=0;i<r;i++){
    	  for( j=0;j<c;j++){
    
    		  arr[i][j]=sc.nextInt();
    	  }
      }
    	  System.out.println("The array elements are");
    	  for(i=0;i<r;i++){
    		  for( j=0;j<c;j++){
    			  System.out.print(arr[i][j] + " ");
    		  }
    		  System.out.println();
    	  }
      }
      
	}


