package com.email.main;

import java.util.Scanner;
import com.email.model.Employee;
import com.email.service.CredentialService;

public class Driver {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee("Nikhil","Kumar");
		CredentialService credentialService=new CredentialService();
		String generatedEmail="";
		char[] generatedPassword;		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		
		if(option==1) {
		generatedEmail=credentialService.generateEmailAddress(employee.getFirstname(),employee.getLastname(),"Technical");
		
		
		}else if(option==2) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstname(),employee.getLastname(),"Admin");
		
			
		}else if(option==3) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstname(),employee.getLastname(),"Human Resource");
		credentialService.generatePassword();
			
		}else if(option==4) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstname(),employee.getLastname(),"Legal");
			credentialService.generatePassword();
			
		}else {
			System.out.println("Enter a valid option");
			scanner.close();
			System.exit(-1);
		}
		
		generatedPassword=credentialService.generatePassword();
		
		credentialService.showCredentials(employee.getFirstname(),generatedEmail,generatedPassword);
		
		scanner.close();
		
	}

}
