package ExceptionHandling;

import java.util.Scanner;
class Persons {
	String name;
}


public class CustomException {
	            public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of the array");
				try{
					int n = sc.nextInt();
				Persons[] s = new Persons[n];
				for (int i = 0; i < n; i++) {
					s[i] = new Persons();
					String temp = sc.next();
					
					for (int j = 0; j < temp.length(); j++) {
						if (Character.isLetter(temp.charAt(j)) != true) {
							
							throw new Exception("Invalid name");
						}

					}
					
					s[i].name = temp;

				}
				}catch(Exception e){
					System.out.println("Exception Handled");
				

			}
		}
	}


