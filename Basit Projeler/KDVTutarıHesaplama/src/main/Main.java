package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double  fiyat;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ürün Fiyatını girin:");
		fiyat = scanner.nextDouble();
		
		if( fiyat<1000) {
		double kdvOranı = 0.18;
		double kdvTutar = fiyat*kdvOranı;
		double kdvliFiyat = fiyat + kdvTutar;
		
		System.out.println(kdvliFiyat);
		}else if(fiyat>=1000){
			double kdvOranı = 0.8;
			double kdvTutar = fiyat*kdvOranı;
			double kdvliFiyat = fiyat + kdvTutar;
			
			System.out.println(kdvliFiyat);
		}

	}

}
