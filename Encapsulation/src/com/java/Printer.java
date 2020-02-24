package com.java;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer(final int tonerLevel, final boolean isDuplex) {
		
		if(tonerLevel >-1 && tonerLevel <=100){
			this.tonerLevel = tonerLevel;
		}else{
			this.tonerLevel = -1;
		}
		
		this.isDuplex = isDuplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount){
		if(tonerLevel > 0 && tonerLevel <= 100){  
			if(this.tonerLevel + tonerAmount > 100){   // not allowed to overfill
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
			
		}else{
			return -1;
		}
	}
	
	public int printPages(int pages){
		int pagesToPrint = pages;
		if(this.isDuplex){
			pagesToPrint = (pages / 2) + (pages % 2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted(){
		return pagesPrinted;
	}
}
