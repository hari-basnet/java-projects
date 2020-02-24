package com.java;

import room.Bed;
import room.BedRoom;
import room.Ceiling;
import room.Lamp;
import room.Wall;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case aCase = new Case("202B", "Dell", "240", dimensions);
        
        Monitor monitor = new Monitor("27inch Beast", "acer", 27, new Resolution(2540,1440));
        
        Motherboard motherboard = new Motherboard("BJ-202", "Asus", 4,6, "v2.44");
     
        PC thePC = new PC(aCase, monitor, motherboard);
        
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Adobe acrobat reader");
        thePC.getTheCase().pressPowerButton();
        
        
        // Room
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        
        Ceiling ceiling = new Ceiling(12, "blue");
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
    
        BedRoom bedroom = new BedRoom("Master-bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        
        bedroom.makeBed();
        
        bedroom.getLamp().turnOn();
    
        
    }
}
