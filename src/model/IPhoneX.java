package model;

public class IPhoneX implements ApplePhoneProduct {
	
	@Override
	public String SendSMS(String numberToSendSMS) {
		return "iPhoneX sending SMS to " + numberToSendSMS;
	}
	
	@Override
	public String dial(String numberToDial) {
		return "iPhoneX dialing " + numberToDial;
	}
	
	@Override
	public String playGames() {
		return "iPhoneX playing ML";
	}
	
	@Override
	public String readHeadFirstDesignPatternBook() {
		return "iPhoneX reading Chapter 1";
	}
	
	@Override
	public String watchMovie() {
		return "iPhoneX watching movie - Justice League";
	}
	
	@Override
	public String playMusic() {
		return "iPhoneX listening Versace on the Floor";
	}
	
	@Override
	public String takeSelfie() {
		return "iPhoneX taking a selfie on a 0.3MP grainy front camera";
	}

}
