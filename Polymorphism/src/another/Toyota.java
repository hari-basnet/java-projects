package another;

class Toyota extends Car{
	
	public Toyota(final int cylinders, final String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " --> startEngine()";
	}
	
	@Override
	public String accelerate() {
		return getClass().getSimpleName() + " --> accelerate()";
	}
	
	@Override
	public String brake() {
		return getClass().getSimpleName() + " --> brake()";
	}
}

