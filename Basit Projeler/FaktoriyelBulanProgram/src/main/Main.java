package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Faktoriel sayısını girin :");
		int n = scn.nextInt();
		int total = 1;
		
		for(int i = 1; i <= n; i++) {
			total = total * i;
		}
		 
		System.out.println(n +". Faktoriyel :" + total);
	}

}
