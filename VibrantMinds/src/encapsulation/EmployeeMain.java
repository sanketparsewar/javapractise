package encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class EmployeeMain {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee emp[] = new Employee[2];
		
		for (int i = 0; i < 2; i++) {
			emp[i] = new Employee();
			
			emp[i].setEmployeeId(i+1);
			
			System.out.print("Enter Employee Name: ");
			emp[i].setEmployeeName(br.readLine());
			
			System.out.print("Enter Employee Salary: ");
			emp[i].setEmployeeSalary(Integer.parseInt(br.readLine()));
		}
		
		  for(Employee employee : emp) { System.out.println(employee); }
		 
		
//		System.out.println(Arrays.toString(emp));
	}
}
