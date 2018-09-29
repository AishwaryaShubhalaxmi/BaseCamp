package strings;

public class StringFuctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l="";
		char[] ch= {'H','E','L','L','O'};  //character array to string
		for(int i=0;i<ch.length;i++){
			l+=ch[i];		}
		//String s= new String(ch);
		System.out.println(l); 
		System.out.println(ch);
		String s=new String(ch);
		System.out.println("S value: "+ s);
      /*  String s2="WORLD";                //String to character array
        char[] ch1=s2.toCharArray();
        for(int i=0;i<s2.length();i++){
        	System.out.print(ch1[i] + " ");
        } 
        System.out.println();
        String s3= "Welcome";
        char[] ch3= new char[s3.length()];
        for(int j=0;j<s3.length();j++){
        	ch3[j]= s3.charAt(j);
        } 
        for(int j=0;j<s3.length();j++){
        System.out.print(ch3[j] + " ");
        
        } */

}
}
