package objectLevelTypecating;
class ParentA{
	void display(){
		System.out.println("Inside parent class");
	}
	
}
class ChildA extends ParentA{
	/*void display1(){
		System.out.println("Inside child class");
	}*/
	void display(){
		System.out.println("Inside child class-display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentA p1=new ParentA();    //Parent class object can only call its own methods
		//p1.display();
		ChildA c1= new ChildA();     // Child class object can call its own methods as well as parent class methods
		//c1.display();
		//c1.display1();
        ParentA p= new ChildA();    //Creating child class object using parent class reference -->can call only the parent class methods
         p.display();   //Implicit Type casting
       // ((ChildA)p).display1();   // Explicit Type casting
         //ChildA c= new ParentA();   //--> cannot convert from parent to child
         ChildA c= (ChildA) new ParentA();      
        c.display();
        //c.display1();
  
		}

}
