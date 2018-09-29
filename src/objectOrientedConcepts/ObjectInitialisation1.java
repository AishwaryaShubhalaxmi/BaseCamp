package objectOrientedConcepts;
class Student{
	String name;
	int id;
	
	
}

public class ObjectInitialisation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student();
		s.name="Aishwarya";
		s.id=6926;
		s1.name="Shivani";
		s1.id=6927;
		System.out.println("The name of student is " + s.name + " and id is " + s.id);
		System.out.println("The name of student is " + s1.name + " and id is " + s1.id);

	}

}


//Initialization through reference