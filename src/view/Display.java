package view;

import model.*;

public class Display {
		public static void print(ApplePhoneProduct applePhone){
			if(applePhone != null){
				if(applePhone instanceof IPhoneX){
					System.out.println("The phone is iPhoneX");	
				}else if(applePhone instanceof IPhone8){
					System.out.println("The phone is iPhone8");
				}else if(applePhone instanceof IPhone7){
					System.out.println("The phone is iPhone7");
				}else if(applePhone instanceof IPhone6){
					System.out.println("The phone is iPhone6");
				}
				System.out.println(applePhone.dial("09123456789"));
			
				System.out.println(applePhone.SendSMS("09876543212"));
				System.out.println(applePhone.playGames());
				System.out.println(applePhone.readHeadFirstDesignPatternBook());
				System.out.println(applePhone.watchMovie());
				System.out.println(applePhone.playMusic());
				System.out.println(applePhone.takeSelfie());
			}
		}
}
