package com.human.ex;

public class Constant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕");
		System.out.println(10);
		//boolean상수
		System.out.println(true);
		System.out.println(false);
		// char 문자상수
		System.out.println('s');
		System.out.println('페');
		// 유니코드 넣어도 된다
		System.out.println('\u0041');
		System.out.println(3f);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14E-4);
		System.out.println(Math.PI);
		byte a1=10;
		byte a2=11;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1+a2);
		System.out.println(a1+1);
		short b1=10;
		short b2= 11;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+b2);
		System.out.println(b2+1);
		int a3=100;
		int a4=101;
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a3*a4);
		// 홍길동 나이 29, 키 170 변수놓어 화면에 출력
		int age= 29;
		int tall= 170;
		System.out.println(age);
		System.out.println(tall);
		//정수자료형, 상수자료형, 문자자료형, 불리언자료형 기술
		//정수자료형- int,long,byte,short 그외 상수자료형-float형,Symbolic상수,double, 등 , 문자자료형-'',"", 불리언자료형- boolean
		// 다음 자료형 이 무슨 자료형인지 확인
		// 10, 1., 6F, 23d, 14E10, 'a'
		//int, double,float,double,e표기법,cha
		// c에 5, d에 10을 넣은다음 c에 3을 증가시킨 후 a,b의 합을 출력하여라
		int c=5;
		int d=10;
		System.out.println((c+3)+d);
		for (int a=0;a<21;a++) {
			if (a%2==0){
				System.out.println(a);
			}
		}
		int x=3;
		x=4;
		x=6;
		System.out.println(x);
	

	}

}
