package objectOrientedConcepts;
class Employee2{
	String name;
	int age;
	double salary;
	public Employee2(){}
	public Employee2(String n, int i, double d){
		name=n;
		age=i;
		salary=d;
	}
	void display(){
		System.out.println("The employee name is " + name + " age is " + age + " salary is " + salary );
	}
}
public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee2 e1=new Employee2("Aish",22,1500.00);
      Employee2 e2=new Employee2("Ankit",23,1600);
      Employee2 e3=new Employee2("Shivani",24,1700.00);
      e1.display();
      e2.display();
      e3.display();
      }

}
