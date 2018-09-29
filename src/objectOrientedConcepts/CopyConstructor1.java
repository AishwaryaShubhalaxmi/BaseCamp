package objectOrientedConcepts;
class Employee4{
	String name;
	int age;
	double salary;
	public Employee4(){}
	public Employee4(String n, int i, double d){
		name=n;
		age=i;
		salary=d;
	}
	 public Employee4(Employee4 e){          //copy constructor by constructor
		name=e.name;
		age=e.age;
		salary=e.salary;
	} 
	void display(){
		System.out.println("The employee name is " + name + " age is " + age + " salary is " + salary );
	}
}
public class CopyConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee4 e1= new Employee4("Aish",22,1600);
      Employee4 e2=new Employee4(e1);
      Employee4 e3= new Employee4(e2);   //can create as many copy constructors as we want
      e1.display();
      e2.display();
      e3.display();
	}

}
