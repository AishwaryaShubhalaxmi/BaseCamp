package ArrayOfObjects;

public class Student {
	private String name;    //data members
	private int roll;
	 public Student() {      //default constructor
		 name=null;
		 roll=0;
	 }
	 public Student(String name, int roll){
		 this.
		 name=name;
		 this.roll=roll;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

}
