package room;

public class Bed {
	
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;
	
	public Bed(final String style, final int pillows, final int height, final int sheets, final int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	
	public void make(){
		System.out.println("Bed --> making bed");
	}
	
	public String getStyle() {
		return style;
	}
	
	public int getPillows() {
		return pillows;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getSheets() {
		return sheets;
	}
	
	public int getQuilt() {
		return quilt;
	}
}
