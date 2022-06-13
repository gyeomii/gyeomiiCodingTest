package BaekJoon.class1;

import java.io.*;
import java.util.Scanner;

public class baekjoon02475 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (byte b : br.readLine().getBytes()) {
			if (b == 32) {
			} else {
				sum += (b - 48) * (b - 48);
			}
		}
		System.out.println(sum % 10);
	}
}
