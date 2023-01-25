package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int normalTutar, mesafe, yaş, yolculukTipi;

		double indirimOranı = 0, indirimliTutar, indirim, toplamTutar = 0, yolculukİndirimi;

		Scanner scn = new Scanner(System.in);

		System.out.println("Mesafeyi KM cinsinden girin :");
		mesafe = scn.nextInt();

		System.out.println("Yaşınızı Girin :");
		yaş = scn.nextInt();

		System.out.println("Yolculuk Tipini Giriniz 1 => Gidiş, 2 => Gidiş - Dönüş");
		yolculukTipi = scn.nextInt();

		normalTutar = (int) (mesafe * 0.10);

		if (yaş < 12) {
			indirimOranı = normalTutar * 1 / 2;

		} else if (yaş < 24) {
			indirimOranı = normalTutar * 1 / 10;
		} else if (yaş > 65) {
			indirimOranı = normalTutar * 3 / 10;
		}
		indirimliTutar = normalTutar - indirimOranı;

		if (yolculukTipi == 1) {
			yolculukİndirimi = 0;
			toplamTutar = indirimliTutar - yolculukİndirimi;
		} else if (yolculukTipi == 2) {
			yolculukİndirimi = indirimliTutar * 0.20;
			toplamTutar = (indirimliTutar - yolculukİndirimi) * 2;
		} else {
			System.out.println("Hatalı giriş yaptınız!");
		}

		System.out.println("Toplam Tutar =" + toplamTutar);

	}

}
