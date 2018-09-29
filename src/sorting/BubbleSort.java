package sorting;
import java.util.*;
public class BubbleSort {

	public static void bubblesort(int[] arr1) {
		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < (arr1.length); j++) {
				if (arr1[i] > arr1[j]) {        //Use < to sort the array in descending order
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 6, 3, 9, 1 }; // Initialize an array
		int n=arr.length;
	  System.out.println("Before sorting");
	    for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
		bubblesort(arr);
		System.out.println("After sorting the array :");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
