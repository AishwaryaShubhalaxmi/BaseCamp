package ExceptionHandling;
import java.sql.SQLException;
import java.util.*;
class Account {
     public Account createAccount() throws Exception{
    	Class class1 = null;
    			class1=Class.forName("bank.Account");
    	 if(class1==null)
    		 throw new ClassNotFoundException();
    	 Account account1=(Account) class1.newInstance();
    	 return account1;
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Account ac= new Account();
		} catch(Exception e){
			System.out.println("Invalid");
		}

	}
     
}




































