package _abstract;

import java.util.Scanner;

abstract class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);

	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	
	public abstract void calcArea(); //상속받은 클래스는 반!드!시! 재구현(Override)를 해줘야함. 
	public abstract void dispArea(); //상속받은 클래스는 반!드!시! 재구현(Override)를 해줘야함. 
}

//-------------------------

class SamTest extends ShapeTest {
	protected int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() { //Override
		area = base * height / 2.0;
	}
	
	@Override
	public void dispArea() { //Override
		System.out.println("삼각형 넓이 = " + area);
	}
}

//-------------------------
class SaTest extends ShapeTest {
	protected int width, height;
	
	
	
	public SaTest() {
		System.out.println("SaTest 기본 생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		
		area = width * height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
	
} 
//-------------------------

class SadariTest extends ShapeTest {
	protected int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본 생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = (top+bottom)*height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = " + area);
	}
	
}
	
	
//-------------------------

public class ShapeMain {
	public static void main(String[] args) {
		SamTest sam = new SamTest(); // 1:1 관계
		 //부모 생성자 먼저 호출되고 자식 생성자가 호출됨
		sam.calcArea(); //자식꺼만 호출됨
		sam.dispArea(); //자식꺼만 호출됨
		
		SaTest saTest = new SaTest();
		saTest.calcArea();
		saTest.dispArea();
		
		SadariTest sadariTest = new SadariTest();
		sadariTest.calcArea();
		sadariTest.dispArea();
		
		
		//결합도 낮추기 (다형성)
		ShapeTest shape;
		shape = new SamTest(); //부모 = 자식
		shape.calcArea();
		shape.dispArea();
		
		shape = new SaTest(); //부모 = 자식
		shape.calcArea();
		shape.dispArea();
		
		shape = new SadariTest(); //부모 = 자식
		shape.calcArea();
		shape.dispArea();
		
	}

}
