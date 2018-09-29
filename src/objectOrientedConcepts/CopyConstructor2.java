package objectOrientedConcepts;
class Employee5{
	String name;
	int age;
	double salary;
	public Employee5(){}
	public Employee5(String n, int i, double d){
		name=n;
		age=i;
		salary=d;
	}
	void display(){
		System.out.println("The employee name is " + name + " age is " + age + " salary is " + salary );
	}
}
public class CopyConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee5 e1=new Employee5("Aish",22,1600);
      Employee5 e2= new Employee5();
      e2.name=e1.name;
      e2.age=e1.age;
      e2.salary=e1.salary;
      e1.display();
      e2.display();
	}

}
