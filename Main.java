package com;

import sun.nio.cs.ext.PCK;

public class Main {

    public static void main(String[] args) {
        CaseDimensions dimensions = new CaseDimensions(20, 20, 10);
	    Case theCase = new Case("220BB", "Dell", dimensions, 200);
	    Monitor monitor = new Monitor("EA445", 2018, "IBM", 300, 40);
	    Motherboard motherboard = new Motherboard("IDM 222", "IBM", 5, 4,500);

	    Computer computer = new Computer(theCase, monitor, motherboard);

	    computer.getMonitor().colorPixel(1400, 200, "green");

	    computer.getMotherboard().setUpProgram("Windows 22");

    }
}
