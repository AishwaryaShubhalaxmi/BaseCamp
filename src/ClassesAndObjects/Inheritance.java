package ClassesAndObjects;
import java.util.*;
 class Polygon{
	 protected int height;
	protected int width;
	public void set_values(int a,int b){
		height=a;
		width=b;
	}
}
 class Rectangle extends Polygon{
	 public double area(){
		 return(height*width);
	 }
 }
 class Triangle extends Polygon{
	 public double area(){
		 return (height*width)/2;
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the height of rec");
      int a=sc.nextInt();
      System.out.println("Enter the width of rec");
      int b=sc.nextInt();
      System.out.println("Enter the height of tri");
      int c=sc.nextInt();
      System.out.println("Enter the width of tri");
      int d=sc.nextInt(); 
      Rectangle rec=new Rectangle();
      Triangle tri=new Triangle();
      rec.set_values(a,b);
      System.out.println(rec.area());
      tri.set_values(a, b);
      System.out.println(tri.area()); 
	}

}
