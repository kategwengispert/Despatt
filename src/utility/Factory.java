package utility;

import model.*;

public class Factory {
	
	public static ApplePhoneProduct createProduct(String phoneModel) {
		ApplePhoneProduct phone = null;
		
		switch(phoneModel.toUpperCase()){
			case "IPHONEX":
				phone = new IPhoneX();
				break;
			case "IPHONE8":
				phone = new IPhone8();
				break;
			case "IPHONE7":
				phone = new IPhone7();
				break;
			case "IPHONE6":
				phone = new IPhone6();
				break;
			default:
				System.err.println("Cannot create phone product. This is not an apple product");
		}
		return phone;
	}
}
