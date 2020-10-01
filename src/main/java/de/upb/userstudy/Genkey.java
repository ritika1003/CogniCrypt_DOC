package de.upb.userstudy;

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

public class Genkey {
	
	public byte[] generateKey() throws NoSuchAlgorithmException {
		
		KeyGenerator keygen = KeyGenerator.getInstance("AES");
		keygen.init(128);
		return generateKey();
	}
}
