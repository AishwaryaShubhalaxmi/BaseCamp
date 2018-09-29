package Basics;
 class Student{
	 String name;
	 int marks;
	// public Student(){}
	 public Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	 }
 }
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student[] s= new Student[6]; //creates reference for objects
       
          s[0]= new Student("Aish", 95);
          s[1]=new Student("Amit", 40);
          s[2]=new Student("Ashwini", 50);
          s[3]=new Student("Anushka", 90);
          s[4]=new Student("Ankita", 80);
          s[5]=new Student("Aman", 45);
          
         for(int i=0;i<6;i++){
        	 System.out.println("The names are " + s[i].name + " and marks are: " + s[i].marks);
         }
       }
       
	}

