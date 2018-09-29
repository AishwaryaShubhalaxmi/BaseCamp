package Searching;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
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
			System.out.print(arr[i] + " ");
		}
		System.out.println("Enter the element to be found");
		int num=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==num){
				 c++;
				 System.out.println("Element found at position: "+ (i+1));
				
				}
			}
		if(c==0){
			System.out.println("Element not found");
			
		}
		else {
		
			System.out.println(c);
		}

	}

}
