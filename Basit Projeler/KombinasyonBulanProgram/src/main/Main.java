package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int r,n;
		
		System.out.println("Kombinasyonunu Bulmak İstediğiniz Sayıları  Girin :");
		n = scn.nextInt();
		r = scn.nextInt();
		
		int nFaktoriyel = 1;
		
		for(int i = 1; i <= n; i++) {
			nFaktoriyel = nFaktoriyel * i;
		}
		
		int rFaktoriyel = 1;
		
		for(int i = 1; i <= r; i++) {
			rFaktoriyel = rFaktoriyel * i;
		}
		
		int nrFaktoriyel = 1;
		
		for(int i = 1; i <= n-r; i++) {
			nrFaktoriyel = nrFaktoriyel * i;
		}
		 
		System.out.println("C(n,r) :" + ( nFaktoriyel / (rFaktoriyel * nrFaktoriyel) ) );
		
	}

}
