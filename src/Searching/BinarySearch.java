package Searching;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0;i<n;i++){
        	System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        	if(arr[i]>arr[j]){
        	int	temp= arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	}
        }
        	System.out.print(arr[i] + " ");
	}
        System.out.println("Enter the element to be searched");
        int num=sc.nextInt();
        int start=0; int end=n-1; int mid=(start+end)/2;
        while(start<=end){
        	  if(mid==num){
        		  System.out.println("The element is at position " + mid);
        		  break;
        	  }
        	  else if(mid>num){
        		 end=mid-1; 
        	  }
        	  else{
        		  start=mid+1;
        	  }
        	mid=(start+end)/2;  
        }
        if(start>end){
        	System.out.println("The element is not found");
        }
	}

}
