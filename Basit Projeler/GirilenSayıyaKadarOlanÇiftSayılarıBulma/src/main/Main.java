package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int k;
		 
		 Scanner scn = new Scanner(System.in);
		 
		 System.out.println("Sayı Giriniz :");
		 k = scn.nextInt();
		 
		 for(int i = 0 ; i <=k ; i ++ ) {
			 if(i % 2 == 0) {
				 System.out.println(i);
			 }
		 }

	}

}
