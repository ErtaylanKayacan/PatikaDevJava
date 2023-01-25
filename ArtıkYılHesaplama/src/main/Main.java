package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yıl;
		
		double mod1,mod2,mod3;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Yıl Girin :");
		yıl = scn.nextInt();
		
		mod1 = yıl % 4;
		mod2 = yıl % 100;
		mod3 = yıl % 400;
		if(mod2 == 0) {
			if(mod3 == 0) {
				System.out.println(yıl + " Bir Artık Yıldır !");
			}else {
				System.out.println(yıl + " Bir Artık Yıl Değildir !");
			}
		}else {
		if(mod1 == 0) {
			System.out.println(yıl + " Bir Artık Yıldır !");
		}else {
			System.out.println(yıl + " Bir Artık Yıl Değildir !");
		}
		}
		
	}

}
