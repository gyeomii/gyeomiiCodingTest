package BaekJoon.conditional;

import java.util.Scanner;

public class baekjoon14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); int y = sc.nextInt();
		sc.close();
		System.out.println(x>0?(y>0?1:4):(y>0?2:3));
	}
}
