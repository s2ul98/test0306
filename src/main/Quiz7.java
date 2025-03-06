package main;

public class Quiz7 {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.sleep();
		human.move();
		human.read();
		
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunt();
		
			

	}

}
abstract class Animal {
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}
	public abstract void move();
	
	
	
}
class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	public void read() {
		System.out.println("사람이 책을 읽습니다");
}
}
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
	public void hunt() {
			System.out.println("호랑이가 사냥을 합니다");
	}

}




