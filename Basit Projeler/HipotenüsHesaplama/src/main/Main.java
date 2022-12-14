package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b;
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci kenarı girin");
		a = scanner.nextInt();
		
		System.out.println("İkinci kenarı girin");
		b = scanner.nextInt();
		
		double c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs =" + c);
		
	}

}
