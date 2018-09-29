package ExceptionHandling;
import java.util.*;
class Solution{
	public static void check(){
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the size of the array");
	      try{
	      int n=sc.nextInt();
	      int[] arr= new int[n];
	      if(n>5){
	    	  throw new ArrayIndexOutOfBoundsException();}
	     
	      if(n<=0){
	    	  throw new NegativeArraySizeException();
	      }
	      System.out.println("Enter the array elements");
	      for(int i=0;i<n;i++){
	    	  arr[i]=sc.nextInt();
	      }
	      
	     
	      }
	      catch(InputMismatchException e){
	    	  System.out.println(" Invalid input ");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	    	  System.out.println("Exception handled");
	      }
	     catch(NegativeArraySizeException e){
	    	  System.out.println("Array size cannot be negative");
	      }
	      catch(Exception e){
	    	  System.out.println("Exception handled");
	      }
	      finally{
	    	  System.out.println("Prints anyway");
	      }
		
	}
}
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution s= new Solution();
		Solution.check();
     
	}
	

}
