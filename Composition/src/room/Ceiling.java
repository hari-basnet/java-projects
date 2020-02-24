package room;

public class Ceiling {
	
	private int height;
	private String paintedColor;
	
	public Ceiling(final int height, final String paintedColor) {
		this.height = height;
		this.paintedColor = paintedColor;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getPaintedColor() {
		return paintedColor;
	}
}
