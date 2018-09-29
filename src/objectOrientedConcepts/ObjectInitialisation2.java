package objectOrientedConcepts;
class Employee{
	String name;
	int age;
	double salary;
	 public void insert(String n, int a, double s){
		 name=n;
		 age=a;
		 salary=s;
	 }
	 public void display(){
		 System.out.println("The details of employee are:  " + name + age + salary  );
	 }
}
public class ObjectInitialisation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee();
       Employee e2=new Employee();
       Employee e3=new Employee();
       e1.insert("Aishwarya ",22 , 16000.00);
       e2.insert("Shivani ",22 , 16000.00);
       e3.insert("Ankit ",20 , 5000.00);
       e1.display();
       e2.display();
       e3.display();
	}

}

//initialization using methods