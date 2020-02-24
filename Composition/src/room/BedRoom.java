package room;

public class BedRoom {
	
	private String name;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	
	public BedRoom(final String name, final Wall wall1, final Wall wall2, final Wall wall3, final Wall wall4,
		final Ceiling ceiling, final Bed bed, final Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	
	public Lamp getLamp(){
		return this.lamp;
	}
	
	public void makeBed(){
		System.out.println("Bedroom --> making bed");
		bed.make();
	}
}
