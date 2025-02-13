package assignmentsVMT1;

import assignmentsVMT1.customexceptions.InvalidAgeException;
import assignmentsVMT1.customexceptions.InvalidEmailException;
import assignmentsVMT1.customexceptions.InvalidPasswordException;

public class School {
	private void homepage(User u) {
		System.out.println("Hello " + u.getuname());
		System.out.print("Your Data: ");
		System.out.println(u);
	}

	private RuntimeException verifyUser(User u) {
		

//		//check Age
		if (!(u.getuage() >= 6))throw new InvalidAgeException("Age Should be not less than 6");
//-----------------------------------------------------------------------
		// Email
		// check Upper case in email
		for (int i = 65; i <= 90; i++) {
			if (u.getuemail().contains(Character.toString((char) i)))throw new InvalidEmailException("Uppercase Not allowed!");
		}

		// check Special character except "@" in email
		if ((u.getuemail().contains(" ")|| u.getuemail().contains("#") || u.getuemail().contains("!")
				|| u.getuemail().contains("~") || u.getuemail().contains("$") || u.getuemail().contains("%")
				|| u.getuemail().contains("^") || u.getuemail().contains("&") || u.getuemail().contains("*")
				|| u.getuemail().contains("(") || u.getuemail().contains(")") || u.getuemail().contains("-")
				|| u.getuemail().contains("+") || u.getuemail().contains("/") || u.getuemail().contains(":")
			    || u.getuemail().contains(", ")|| u.getuemail().contains("<")
				|| u.getuemail().contains(">") || u.getuemail().contains("?")
				|| u.getuemail().contains("|") ))
			throw new InvalidEmailException("Special character except @ not allowed!");
		
		if(u.getuemail().split("@").length!=2)throw new InvalidEmailException("Invalid character!");
		

		// check valid email endings
		if (!(u.getuemail().endsWith("@gmail.com") || u.getuemail().endsWith("@live.com")|| u.getuemail().endsWith("@outlook.com")))
			throw new InvalidEmailException("Endings except @gmail.com or @live.com or @outlook.com not allowed!");

//----------------------------------------------------------------------
		
//		check password
		// check length between 8 to 15 of password
		if (!(u.getupassword().length() >= 8 && u.getupassword().length() <= 15))throw new InvalidPasswordException("Invalid Length");

		// check at least 1 digit in password
		int count = 0;
		for (int i = 0; i <= 9; i++) {
			if (!u.getupassword().contains(Integer.toString(i))) count++;
		}
		
		// check at least 1 lower case in password
		for (int i = 'A'; i <= 'Z'; i++) {
			if (!u.getupassword().contains(Character.toString((char) i)))count++;
		}

		// check at least 1 Upper case in password
		for (int i = 'a'; i <= 'z'; i++) {
			if (!u.getupassword().contains(Character.toString((char) i)))count++;
		}

		// check at least 1 special character in password
		if (!(u.getupassword().contains("@") || u.getupassword().contains("#") || u.getupassword().contains("!")
				|| u.getupassword().contains("~") || u.getupassword().contains("$") || u.getupassword().contains("%")
				|| u.getupassword().contains("^") || u.getupassword().contains("&") || u.getupassword().contains("*")
				|| u.getupassword().contains("(") || u.getupassword().contains(")") || u.getupassword().contains("-")
				|| u.getupassword().contains("+") || u.getupassword().contains("/") || u.getupassword().contains(":")
				|| u.getupassword().contains(".") || u.getupassword().contains(", ") || u.getupassword().contains("<")
				|| u.getupassword().contains(">") || u.getupassword().contains("?")
				|| u.getupassword().contains("|"))) count++;
		
		//check from above if any condition violates
		if (count == 0) throw new InvalidPasswordException();
		
		else return null;
		
	}

	public void login(User u) {
		RuntimeException re = verifyUser(u);
		if (re == null)
			homepage(u);
		else
		{System.out.println("program end");
			throw re;
		}
	}
}
