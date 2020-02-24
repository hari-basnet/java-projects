package room;

public class Window {
	
	private int numOfWindows;
	private boolean isOpen;
	private boolean isClosed;
	
	public Window(final int numOfWindows) {
		this.numOfWindows = numOfWindows;
		this.isOpen = false;
		this.isClosed = true;
	}
	
	public void openWidow(){
		if(!isOpen){
			this.isOpen = true;
			System.out.println("Window is opened now...");
			this.isClosed = false;
		}else{
			System.out.println("Window is already opened");
		}
	}
	
	public void closeWindow(){
		
		if(!isClosed){
			this.isClosed = true;
			System.out.println("Window is closed now...");
			this.isOpen = false;
		}else{
			System.out.println("Window is already closed");
		}
	}
	
	public int getNumOfWindows() {
		return numOfWindows;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public boolean isClosed() {
		return isClosed;
	}
}
