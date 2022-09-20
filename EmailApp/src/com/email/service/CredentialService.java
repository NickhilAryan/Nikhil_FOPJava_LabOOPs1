package com.email.service;

import java.util.Random;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String numbers="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random=new Random();
		
		char [] password=new char[8];
		
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
			
		}
		
		return password;
		
		
	}
	
	public String generateEmailAddress(String firstname,String lastname, String department) {
		
		return firstname+lastname+"@"+department+"peoplelink.com";
		
	}
	
	public void showCredentials(String firstname, String email,char[] Password) {
		
		System.out.println("Dear "+firstname+" your generated credentials are as follows:");
		System.out.println("Email      --->"+email);
		System.out.println("Password   --->"+Password);
	}
	
	

}
