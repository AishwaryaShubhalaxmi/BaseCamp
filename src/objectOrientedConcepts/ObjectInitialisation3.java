package objectOrientedConcepts;
import java.util.*;
class Employee1{
	String name;
	int age;
	double salary;
	public Employee1(){
		
	}
	 public Employee1(String name,int age,double salary){
		 this.name=name;
		 this.age=age;
		 this.salary=salary;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		 
		
}
public class ObjectInitialisation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of employees");
       int n=sc.nextInt();
       Employee1[] e= new Employee1[n];
       for(int i=0;i<n;i++){
    	   e[i]= new Employee1();
       }
       System.out.println("Enter the name of the employees");
       for(int i=0;i<n;i++){
    	   e[i].setName(sc.next());
       }
       System.out.println("Enter the age of the employee");
       for(int i=0;i<n;i++){
    	   e[i].setAge(sc.nextInt());
       }
       System.out.println("Enter the salary of the employee");
       for(int i=0;i<n;i++){
    	   e[i].setSalary(sc.nextDouble());
       }
       for(int i=0;i<n;i++){
    	   System.out.println("The employee name is " + e[i].getName() + " age is " + e[i].getAge() + " salary is " + e[i].getSalary() );
       }
	}

}
