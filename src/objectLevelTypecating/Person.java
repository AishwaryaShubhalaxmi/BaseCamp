package objectLevelTypecating;
class PersonA{
	void display(){
		System.out.println("Inside parent class");
	}
}
class PersonB extends PersonA{
	void display1(){
		System.out.println("Inside first child class");
	}
}
 class PersonC extends PersonA {
      void display2(){
    	  System.out.println("Inside second child class");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonA p= new PersonA();
		p.display();
		((PersonB) p).display1(); //class cast exception
		
		PersonB p1=new PersonB();
		p1.display();
		p1.display1();
	
		PersonC p2= new PersonC();
		p2.display();
		p2.display2();
		
		 PersonA p3= new PersonB();
		 p3.display();       //implicit type casting
        ((PersonB)p3).display1(); //explicit type casting
        
        
         PersonA p4 =new PersonC();
         p4.display();
         ((PersonC) p4).display2();
         
         
	}

}
