package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double kilo;
		double boy;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu Girin :");
		kilo = scanner.nextDouble();
		
		System.out.println("Boyunuzu girin :");
		boy = scanner.nextDouble();
		
		System.out.println("Vücut Kitle Endeksiniz =" + kilo / (boy*boy));
		
	}

}
