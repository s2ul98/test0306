package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		 if(sum >= 300) {
			break;
		}
		 System.out.println("i = " + i + " / " + "sum = " + sum);
		}
	}
}



