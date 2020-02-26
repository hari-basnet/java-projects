package another;

public class Car {
	
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car(final int cylinders, final String name) {
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}
	
	public String startEngine(){
		return "Car --> start engine.";
	}
	
	public String accelerate(){
		return "Car --> accelerate";
	}
	
	public String brake(){
		return "Car --> brake";
	}
	
	public String getName() {
		return name;
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
}

class Mitsubishi extends Car{
	
	public Mitsubishi(final int cylinders, final String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		return "Mitsubishi --> startEngine()";
	}
	
	@Override
	public String accelerate() {
		return "Mitsubishi --> accelerate()";
	}
	
	@Override
	public String brake() {
		return "Mitsubishi --> brake()";
	}
}

class Main {
	public static void main(String[] args){
		
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		
		Toyota mitsubishi = new Toyota(6, "Outlander");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		System.out.println(mitsubishi.getName());
		
		Ford ford = new Ford(6, "Focus");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Toyota toyota = new Toyota(6, "Land Cruiser");
		System.out.println(toyota.startEngine());
		System.out.println(toyota.accelerate());
		System.out.println(toyota.brake());
	} 
}