package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int k,n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üstü Alınacak Sayıyı Girin:");
		n = scanner.nextInt() ;
		
		System.out.println("Üs Olacak Sayı:");
		k = scanner.nextInt();
		
		int total  = 1;
		int i =1;
		
		while(i<=k) {
			total *= n;
			i++;
		}
		
		System.out.println("Cevap :" + total);
		
	}

}
