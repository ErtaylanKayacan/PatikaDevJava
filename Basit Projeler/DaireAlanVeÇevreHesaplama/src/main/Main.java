package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int r;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dairenin Yarı Çapını Girin :");
		r = scanner.nextInt();
		
		double alan = pi*r*r;
		double çevre = pi*2*r;
		
		System.out.println("Dairenin Alanı :" + alan );
		System.out.println("Dairenin Çevresi :" + çevre);
	}
}
