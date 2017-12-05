package model;

public class IPhone6 implements ApplePhoneProduct {
	
	@Override
	public String SendSMS(String numberToSendSMS) {
		return "iPhone6 sending SMS to " + numberToSendSMS;
	}
	
	@Override
	public String dial(String numberToDial) {
		return "iPhone6 dialing " + numberToDial;
	}
	
	@Override
	public String playGames() {
		return "iPhone6 playing ML";
	}
	
	@Override
	public String readHeadFirstDesignPatternBook() {
		return "iPhone6 reading Chapter 1";
	}
	
	@Override
	public String watchMovie() {
		return "iPhone6 watching movie - Justice League";
	}
	
	@Override
	public String playMusic() {
		return "iPhone6 listening Versace on the Floor";
	}
	
	@Override
	public String takeSelfie() {
		return "iPhone6 taking a selfie on a 0.3MP grainy front camera";
	}

}
