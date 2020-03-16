package br.com.uiid.domain.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Application {

	public static void main(String[] args) {
		
		byte[] rawIdBytes = null;
		
		String randomUUID = java.util.UUID.randomUUID().toString();
		
		String nameUUIDFromBytes = java.util.UUID.nameUUIDFromBytes("name".getBytes()).toString();
		
		SecureRandom generator = new SecureRandom();
		int randomNumber = generator.nextInt();
		String randomDigits = new Integer(randomNumber).toString();
		
		
		try {
			MessageDigest encryptor = MessageDigest.getInstance("SHA-1");
			rawIdBytes = encryptor.digest(randomDigits.getBytes());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Random UUID: " + randomUUID);
		System.out.println("UUID From Bytes: " + nameUUIDFromBytes);
		System.out.println("UUID From Encryptor: " + rawIdBytes);
		
		
	}
	
}
