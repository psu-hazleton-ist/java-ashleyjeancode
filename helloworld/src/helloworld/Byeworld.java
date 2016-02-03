package helloworld;

public class Byeworld {
	private String goodbyemessage;
	
	public Byeworld() {
		this.goodbyemessage = "Goodbye";
	}
	
	public Byeworld(String goodbyemessage) {
		this.goodbyemessage = goodbyemessage;
	}
	
	public String getgoodbye() {
		return this.goodbyemessage;
	}
}
