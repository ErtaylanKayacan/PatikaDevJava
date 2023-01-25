package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Birinci Sayıyı Girin :");
		int n1 = scn.nextInt();
		
		System.out.println("ikinci Sayıyı Girin :");
		int n2 = scn.nextInt();
		
		int ebob = 1;
		for(int k = n1 ; k >= 1 ; k--) {
			if(k % n1 == 0 && n2 % k == 0) {
				ebob = k ;
				break;
			}
			
		for(int i = 1; i <= (n1*n2); i ++) {
			if ( i % n1 == 0 && i % n2 == 0) {
				System.out.println(i);
			}
			
		}
		
		}
		
		System.out.println((n1*n2) / ebob);
	}

}
