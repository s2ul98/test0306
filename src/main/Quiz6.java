package main;

public class Quiz6 {

	public static void main(String[] args) {
	
		System.out.println("볼펜의 굵기 : 2");
		System.out.println("볼펜의 남은양 : 100%");
		System.out.println("볼펜의 색 : 파랑색");
		
		System.out.println();
		
		System.out.println("만년필의 굵기 : 2");
		System.out.println("만년필의 남은양 : 80%");
		System.out.println("만년필의 브랜드 : 몽블랑");
		
		

	
		Ball ball = new Ball();
//		ball.t();
		
		
	}

}
abstract class Pen {
	int t;
	int y;
	
	public Pen(int t, int y) {
		super();
		this.t = t;
		this.y = y;
	}
	
	
	
	
}
class Ball extends Pen {
	String c;


}

class Man extends Pen {
	String b;

	
	
}