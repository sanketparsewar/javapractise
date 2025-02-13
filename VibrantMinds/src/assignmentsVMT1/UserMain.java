package assignmentsVMT1;

import assignmentsVMT1.customexceptions.InvalidAgeException;
import assignmentsVMT1.customexceptions.InvalidEmailException;
import assignmentsVMT1.customexceptions.InvalidPasswordException;

public class UserMain {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setuname("Sanket Parsewar");
		u1.setuage(22);
		u1.setuemail("sanketp@live.com");
		u1.setupassword("Sanket@2001");
		
		User u2=new User();
		u2.setuname("Aditya Kalambe");
		u2.setuage(22);
		u2.setuemail("aidtya.kalambe@outlook.com");
		u2.setupassword("Aditya@2001");
		
		User u3=new User();
		u3.setuname("Vaibhav Parsewar");
		u3.setuage(23);
		u3.setuemail("vaibavparsewar@live.com");
		u3.setupassword("VaibhavP@12345");
		
		User u4 = new User();
		u4.setuname("Hitesh Dhewade");
		u4.setuage(22);
		u4.setuemail("hitesh.rockboy@gmail.com");
		u4.setupassword("Hitu@0001");
		
		School s = new School();
		try {
			s.login(u1);
			System.out.println();
			s.login(u2);
			System.out.println();
			s.login(u3);
			System.out.println();
			s.login(u4);
		}
		catch(InvalidAgeException | InvalidPasswordException  |InvalidEmailException e) {
			System.out.println(e);
		}

	}
}
