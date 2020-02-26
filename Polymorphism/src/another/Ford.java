package another;

class Ford extends Car{
	
	public Ford(final int cylinders, final String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		return "Ford --> startEngine()";
	}
	
	@Override
	public String accelerate() {
		return "Ford --> accelerate()";
	}
	
	@Override
	public String brake() {
		return "Ford --> brake()";
	}
}

