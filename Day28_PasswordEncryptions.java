package webdriverautomation;

import org.apache.hc.client5.http.utils.Base64;

public class Day28_PasswordEncryptions {

	public static void main(String[] args) {
		
		// encode password
		
		String str = "SQA123";
		
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		
		System.out.println("Encoded string:"+new String(encodedString));  //Output> encoded string:U1FBMTIz
		
		
		// decode password
		
        byte[] decodedString = Base64.decodeBase64(encodedString);
		
		System.out.println("Decoded string:"+new String(decodedString));  //Output> encoded string:U1FBMTIz
		
		
		
		
		
		
		
		
		

	}

}
