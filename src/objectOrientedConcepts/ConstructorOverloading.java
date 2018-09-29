package objectOrientedConcepts;
class Employee3{
	String name;
	int age;
	double salary;
	public Employee3(){}
	public Employee3(String n, int i, double d){
		name=n;
		age=i;
		salary=d;
	}
	public Employee3(String n, int i){        // constructor overloading
		name=n;
		age=i;
	
	}
	void display(){
		System.out.println("The employee name is " + name + " age is " + age + " salary is " + salary );
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee3 e1=new Employee3("Aish", 22, 1600);
        Employee3 e2=new Employee3("Shivani", 23);
        e1.display();
        e2.display();
        
	}

}
