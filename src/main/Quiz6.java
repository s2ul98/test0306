package main;

public class Quiz6 {

	public static void main(String[] args) {
	
		Pen pen1 = new 
		Pen pen2 = new 
	
	}

}
class Pen {
	int p; // 굵기
	int y; //양
	
	public Pen(int p, int y) {
		super();
		this.p = p;
		this.y = y;
		
		
	}
}
class Ball implements Pen {
	String c; // 색

	public Ball(String c) {
		super();
		this.c = c;
	
	}
}

class Man implements Pen {
	String b; // 회사

	public Man(String b) {
		super();
		this.b = b;
	}
	
	
}