package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int total = 0;
		
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("Sayı Giriniz :");
			n = scn.nextInt();
			
			if(n % 2 == 1) {
				total += n;
			}
			
		}while(n>0);
		
		System.out.println("Toplam :" + total);
	}

}
