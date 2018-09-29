package arraysAndStrings;
import java.util.*;
public class MeanderingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int[] a= new int[n];
      int temp=0;
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++){
    	  a[i]= sc.nextInt();
      }
      System.out.println("The array elements are: ");
      for(int i=0;i<n;i++){
    	  System.out.print(a[i] + " ");
      }
      for(int i=0;i<n;i++){
    	  for(int j=i+1;j<n;j++){
    		  if(a[i]>a[j]){
          		temp= a[i];
          		a[i]=a[j];
          		a[j]=temp;
          	}
    	  } 
    	  System.out.println("The sorted array is:");
    	  for(int l=0;l<n;l++){
    	  System.out.print(a[l] + " ");
    	  }
    	/*  for(int k=0;k<n;i++){
    		  if(k==0)
    			  a[k]=a[n-1];
    		  if(k==1)
    			  a[k]= a[0];
    		  while(k!=0 && k!=1){
    		  if(k%2==0){
    			a[k]=a[n-k];
    		  }
    		  if(k%2!=0){
    			  
    		  }
    			  
    		  }
    		  
    		  
    		  
    	  } */
    	        } 
	}

}
