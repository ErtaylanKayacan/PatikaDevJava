package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int mat,kimya,fizik,turkce,muzik;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Fizik Notunuzu Girin:");
			fizik = scanner.nextInt();
			
			System.out.println("Kimya Notunuzu Girin:");
			kimya = scanner.nextInt();
			
			System.out.println("Türkçe Notunuzu Girin:");
			turkce = scanner.nextInt();
			
			System.out.println("Müzik Notunuzu Girin:");
			muzik = scanner.nextInt();
			
			System.out.println("Matematik Notunuzu Girin:");
			mat = scanner.nextInt();
			
			System.out.println("Ortalamanız =" + (mat + kimya + fizik + turkce + muzik) / 5);
				
	}

}