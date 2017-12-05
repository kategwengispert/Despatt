package model;

public class IPhone8 implements ApplePhoneProduct {
	
	@Override
	public String SendSMS(String numberToSendSMS) {
		return "iPhone8 sending SMS to " + numberToSendSMS;
	}
	
	@Override
	public String dial(String numberToDial) {
		return "iPhone8 dialing " + numberToDial;
	}
	
	@Override
	public String playGames() {
		return "iPhone8 playing ML";
	}
	
	@Override
	public String readHeadFirstDesignPatternBook() {
		return "iPhone8 reading Chapter 1";
	}
	
	@Override
	public String watchMovie() {
		return "iPhone8 watching movie - Justice League";
	}
	
	@Override
	public String playMusic() {
		return "iPhone8 listening Versace on the Floor";
	}
	
	@Override
	public String takeSelfie() {
		return "iPhone8 taking a selfie on a 0.3MP grainy front camera";
	}

}
