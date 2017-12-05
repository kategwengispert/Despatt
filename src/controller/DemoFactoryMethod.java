package controller;

import model.*;
import utility.*;
import view.*;

public class DemoFactoryMethod {

	public static void main(String[] args) {
		ApplePhoneProduct phone = Factory.createProduct("iPhoneX");
		Display.print(phone);
		
		phone = Factory.createProduct("iphone8");
		Display.print(phone);
		
		phone = Factory.createProduct("iphone7");
		Display.print(phone);
		
		phone = Factory.createProduct("iphone6");
		Display.print(phone);
		
		phone = Factory.createProduct("iphoneXiaomiMiMix");
		Display.print(phone);
	}

}
