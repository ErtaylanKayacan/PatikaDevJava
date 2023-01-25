package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sayı Girin;");
		int n = scn.nextInt();
		
		for (int i = 0 ; i <= n ; i ++) {
			for (int k = 0; k <= (n-i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i + 1); j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
	
		}
		
		
		for(int i = 0; i<n; i++){ 
            for(int j=n; j>=n-i-1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<(n-i)*2; k++){ 
                System.out.print("*");
            }
            System.out.println("");
        }
		
		
			}

}
