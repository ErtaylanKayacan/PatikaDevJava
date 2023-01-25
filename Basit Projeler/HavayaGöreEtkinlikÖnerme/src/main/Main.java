package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hava Sıcaklığını Girin");
		heat = scanner.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak YapaBilirsiniz");
		}else if(heat<=25) {
			if(heat<=15) {
				System.out.println("Sinemaya Gidebilisin");
			}
			
			if(heat > 15) {
				System.out.println("Pikniğe Gidebilirsin");
			}else if(heat >25) {
				System.out.println("yüzmeye gidebilirsin");
			}
		}
		
		

	}

}
