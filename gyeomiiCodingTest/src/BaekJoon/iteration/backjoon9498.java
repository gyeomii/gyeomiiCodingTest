package BaekJoon.iteration;

import java.util.Scanner;

public class backjoon9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char result; 
		switch(score/10) {
		case 10:
		case 9:
			result = 'A';
			break;
		case 8:
			result = 'B';
			break;
		case 7:
			result = 'C';
			break;
		case 6:
			result = 'D';
			break;
		default:
			result = 'F';
			break;
		}
		sc.close();
		System.out.println(result);
	}
}
