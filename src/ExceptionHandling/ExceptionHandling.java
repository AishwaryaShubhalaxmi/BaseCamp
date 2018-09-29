package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try{
        	 try{
        		 int a=50/0;
        	 }
        	 catch(ArithmeticException e){
        		 System.out.println("Cannot divide by 0");
        	 }
        	 try{
        		 int[] a= new int[4];
        		 a[6]=10;
        	 }catch(ArrayIndexOutOfBoundsException e1){
        		 System.out.println("Array contains only 5 elements");
        	 }
        	 try{
        		 String s=null;
        		 System.out.println(s.length());
        	 }catch(NullPointerException e2){
        		 System.out.println("String is empty");
        	 }
         }catch(Exception e4){
        	 System.out.println("Exception handled");
         }
         finally{
        	 System.out.println("Always gets executed");
         }
	}

}
