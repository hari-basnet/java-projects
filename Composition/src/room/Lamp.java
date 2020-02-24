package room;

public class Lamp {
	
	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(final String style, final boolean battery, final int globRating) {
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	
	public void turnOn(){
		System.out.println("Lamp --> turned on");
	}
	public String getStyle() {
		return style;
	}
	
	public boolean isBattery() {
		return battery;
	}
	
	public int getGlobRating() {
		return globRating;
	}
}
