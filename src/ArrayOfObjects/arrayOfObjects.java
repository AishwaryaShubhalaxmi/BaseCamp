package ArrayOfObjects;
import java.util.*;
public class arrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
         int n=sc.nextInt();
         Student[] s= new Student[n];
         for(int i=0;i<n;i++){
        	 s[i]= new Student();
         }
         System.out.println("Enter the n roll numbers");
         for(int i=0;i<n;i++){
        	 s[i].setRoll(sc.nextInt());
         }
         System.out.println("Enter the names of n students");
         for(int i=0;i<n;i++){
        	 s[i].setName(sc.next());
         }
         for(int i=0;i<n;i++){
         System.out.println("Student name is: " + s[i].getName());
         System.out.println("Student roll number is:" + s[i].getRoll());
	}

}
}
