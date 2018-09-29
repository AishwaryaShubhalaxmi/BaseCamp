package ExceptionHandling;

import java.util.Scanner;

/*
 * Create the Encrypter class here.

 */
class Encrypter {
	static String getEncryptedName(String name) {
		Validator v = new Validator();
		String s = "";
		if (v.validate(name)) {

			for (int i = name.length()-1; i >= 0; i--) {
				s += name.charAt(i);
			}
			s = s.toLowerCase();
			return s;
		} else {
			throw new IllegalArgumentException("Try again with valid name");
		}
	}
}

class Validator {
	public boolean validate(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch != ' '
					&& !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
				return false;
			}
		}

		return true;
	}
}

public class IllegalException {
	private static final Scanner INPUT_READER = new Scanner(System.in);

	public static void main(String[] args) {
		String name = INPUT_READER.nextLine();

		try {
			System.out.println(Encrypter.getEncryptedName(name));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}