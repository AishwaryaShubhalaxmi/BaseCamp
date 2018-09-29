package sorting;
import java.util.*;
public class InsertionSort {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("The array elements are");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<n;i++){
			System.out.println(arr[i] + " ");
		}
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;
           while(temp< arr[j] && j>=0){
        	
            	arr[j+1]=arr[j];
            	j=j-1;
            	
           }            	
            	arr[j+1]=temp;
            
		}
	 
		
		
		System.out.println("After sorting");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	} 
}

