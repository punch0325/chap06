package com.example;


import util.Color;
import util.VT100;
// VT100 클래스를 import하여 현재 클래스에서 사용 가능
// ctrl+shift+O  : import 단축키
// Ctrl 누른 상태로 클래스 이름을 누르면 해당 클래스로 이동

public class PackageExample {

	public static void main(String[] args) {
		VT100.clearScreen();
		
		VT100.corsorMove(10,10);
		VT100.setbackground(31);
		VT100.setbackground(42);
		System.out.println("Hello");
		
		VT100.corsorMove(13,5);
		VT100.setForeground(32);
		VT100.setbackground(41);
		System.out.println("World!");		
		
		VT100.corsorMove(5,20);
		VT100.setForeground(33);
		VT100.setbackground(45);
		System.out.println("Hello World!");
		
		VT100.corsorMove(9,40);
		VT100.setForeground(Color.Magenta);
		VT100.setbackground(Color.Yellow);
		System.out.println("Color");
		
		VT100.reset();
		
		
		

		
	}

}
