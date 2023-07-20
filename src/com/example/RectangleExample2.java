package com.example;

import util.Alpha;
import util.VT100;

public class RectangleExample2 {

// 객체지향 프로그래밍
	
	public static void main(String[] args) throws InterruptedException {
		
		
		VT100.clearScreen();
		
		boolean[][] rect = new boolean[20][40];
		int count = 0;
		int forCount = 0;
		
		for (;;) {
			Alpha alpha = new Alpha();
			alpha.show1();
					
			if (rect[alpha.getLine()-1][alpha.getCol()-1] == false) {
				rect[alpha.getLine()-1][alpha.getCol()-1] = true;
				count++;
			}
				
			VT100.reset();
			VT100.corsorMove(1, 42);
			System.out.printf("forCount= [%5d]", forCount++);
			
			if (count==800)
				break;
			
			Thread.sleep(1);
		}

		VT100.reset();
		VT100.corsorMove(21, 1);
		System.out.println("Program End...");
	}

}
