package BaekJoon.class1;

import java.io.*;
import java.util.HashSet;

public class baekjoon3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(h.size());
	}
}
