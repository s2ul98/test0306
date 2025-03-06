package main;

public class Quiz2 {

	public static void main(String[] args) {
		
		int m = 3;
		
		if(3 <= m && m <= 5) {
			System.out.println("현재 계절을 봄입니다");
		} else if(6 <= m && m <= 8) {
			System.out.println("현재 계절은 여름입니다");
		} else if(9 <= m && m <= 11) {
			System.out.println("현재 계절은 가을입니다");
		} else if(m == 12 && m == 1 && m == 2) {
			System.out.println("현재 계절은 겨울입니다");
		} else {
			System.out.println("잘못된 값입니다");

	}

}

}