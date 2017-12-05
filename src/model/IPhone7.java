package model;

public class IPhone7 implements ApplePhoneProduct {
	
	@Override
	public String SendSMS(String numberToSendSMS) {
		return "iPhone7 sending SMS to " + numberToSendSMS;
	}
	
	@Override
	public String dial(String numberToDial) {
		return "iPhone7 dialing " + numberToDial;
	}
	
	@Override
	public String playGames() {
		return "iPhone7 playing ML";
	}
	
	@Override
	public String readHeadFirstDesignPatternBook() {
		return "iPhone7 reading Chapter 1";
	}
	
	@Override
	public String watchMovie() {
		return "iPhone7 watching movie - Justice League";
	}
	
	@Override
	public String playMusic() {
		return "iPhone7 listening Versace on the Floor";
	}
	
	@Override
	public String takeSelfie() {
		return "iPhone7 taking a selfie on a 0.3MP grainy front camera";
	}

}
