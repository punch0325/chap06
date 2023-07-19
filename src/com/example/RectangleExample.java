package com.example;

import util.Alpha;
import util.VT100;

public class RectangleExample {

	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		
		for (int i = 0 ; i <1000; i++) {
			Alpha alpha = new Alpha();
			alpha.show();
			
			VT100.reset();
			VT100.corsorMove(1, 42);
			System.out.printf("count = [%05d]", i);
			
			Thread.sleep(5);
		}

		VT100.reset();
		VT100.corsorMove(21, 1);
		System.out.println("Program End...");
	}

}
