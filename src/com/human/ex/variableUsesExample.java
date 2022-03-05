package com.human.ex;

public class variableUsesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간"+minute+"분");
		int totalMinute =(hour*60)+minute;
		System.out.println("총"+ totalMinute+"분");
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x+"y:"+y);
		
		y=x;
		System.out.println(y);
		
		int temp = x;
		x = y;
		y = temp;
		
		int ver1 = 0b1011;
		int ver2 = 013; 
		int ver3 = 0XB3; 

		System.out.println("ver1=" + ver1); 
		System.out.println("ver2=" + ver2); 
		System.out.println("ver3="+ ver3); 

		
	}
	

}
