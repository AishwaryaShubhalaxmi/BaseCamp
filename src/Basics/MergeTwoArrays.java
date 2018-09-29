package Basics;
import java.util.*;
public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of the first array");
      int n=sc.nextInt();
      System.out.println("Enter the size of the second array");
      int m= sc.nextInt();
      int[] a= new int[n];
      int[] b= new int[m];
      int[] res= new int[a.length + b.length];
      System.out.println("Enter the elements of the first array");
      for(int i=0;i<n;i++){
    	  a[i]= sc.nextInt();
      }
      System.out.println("Enter the elements of the second array");
      for(int i=0;i<m;i++){
    	  b[i]= sc.nextInt();
      }
      System.out.println("The elements of first array are:");
      for(int i=0;i<n;i++){
    	  System.out.print(a[i] + " ");
      }
      System.out.println("\n");
      System.out.println("The elements of second array are:");
      for(int i=0;i<m;i++){
    	  System.out.print(b[i] + " ");
      }
		int k=0;
		for(int i=0;i<n;i++){
			res[i]=a[i];
			k++;
		}
		for(int i=0;i<m;i++){
			res[k]=b[i];
			k++;
		}
		System.out.println("\n");
		System.out.println("The resultant array is: ");
		for(int i=0;i<(a.length + b.length);i++){
			System.out.print(res[i] + " ");
		}
	}

}
