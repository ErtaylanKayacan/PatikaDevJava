package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		int n;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sınır Sayınızı Girin :" );
		n= scn.nextInt();
		
		for(int i = 1 ; i<= n ; i *= 2 ) {
			System.out.println(i);
		}
		
		
	}

}
