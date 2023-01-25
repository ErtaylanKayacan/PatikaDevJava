package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;	
		double patlıcan= 5;
		
		int armutKg;
		int elmaKg;
		int domatesKg;
		int muzKg;
		int patlıcanKg;
		
		System.out.println("Armut Kaç Kilo ?");
		armutKg = scanner.nextInt();
		
		System.out.println("Elma Kaç Kilo ?");
		elmaKg = scanner.nextInt();
		
		System.out.println("Domates Kaç Kilo ?");
		domatesKg = scanner.nextInt();
		
		System.out.println("Muz Kaç Kilo ?");
		muzKg = scanner.nextInt();
		
		System.out.println("Patlıcan Kaç Kilo ?");
		patlıcanKg = scanner.nextInt();
		
		
		
		System.out.println("Toplam Tutar =" + (armut*armutKg + domates*domatesKg + elma*elmaKg + muz*muzKg + patlıcan*patlıcanKg));
		
		
		
	}

}
