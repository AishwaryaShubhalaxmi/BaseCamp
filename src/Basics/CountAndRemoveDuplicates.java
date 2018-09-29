package Basics;
import java.util.*;
public class CountAndRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		int count=0;
		int temp=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
			if(arr[i]==arr[j]){
				count++;
			  temp=arr[i];}
			} 
			}
			
		
		System.out.println("\n");
		System.out.println("The number of duplicate elements are " + count);
		for(int l=0;l<n;l++){
		 System.out.println(temp);}
		
	}

}

