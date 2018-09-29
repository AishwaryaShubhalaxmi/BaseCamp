package Basics;
import java.util.*;

public class PrintOddNEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n");
		System.out.println("The even elements are: ");
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
				}
			}
		System.out.println("The odd elements are: ");
		for(int i=0;i<n;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i]);
			}
		}
	}

}
