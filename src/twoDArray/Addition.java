package twoDArray;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows of array");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns of array");
		int c=sc.nextInt();
		int[][] a= new int[r][c];
		int[][] b=new int[r][c];
		int[][] res=new int [r][c];
		System.out.println("Enter the array elements of first array");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array elements of second array");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The first array is: ");
		for(int i=0;i<r;i++){
			System.out.println();
			for(int j=0;j<c;j++){
		System.out.print(a[i][j] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("The second array is: ");
		for(int i=0;i<r;i++){
			System.out.println();
			for(int j=0;j<c;j++){
		System.out.print(b[i][j] + " ");
			}
		}
		System.out.println("The resultant array is:");
		for(int i=0;i<r;i++){
			System.out.println();
			for(int j=0;j<c;j++){
				System.out.print((res[i][j]=a[i][j] + b[i][j]) + " ");
			}
		}


	}

}
