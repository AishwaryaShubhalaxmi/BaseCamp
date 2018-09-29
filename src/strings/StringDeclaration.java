package strings;
import java.util.*;
public class StringDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Aishwarya";   //using string literal
        String s2= new String("Shivani"); //using new keyword
        char[] ch ={'A','I','S','H','W','A','R','Y','A'};  //char array to string
        String s3= new String(ch);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
	}

}
