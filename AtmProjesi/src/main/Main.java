package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String userName, password;
		
		int right = 3;
		int balance = 1500;
		int select;
		
		while (right >0) {
			System.out.println("Merhaba Bankamıza Hoş Geldiniz ! ");
			
			
			System.out.println("Kullanıcı Adınızı Girin");
			userName = scn.nextLine();
			
			System.out.println("Parolanızı Girin");
			password = scn.nextLine();
			
			if(userName.equals("ErtaylanKayacan") && password.equals("Ertaylan1234") ) {
				do {
					
				System.out.println("1 - Para Yatırma \n " +
									"2 - Para Çekme \n" +
									"3 - Bakiye Sorgu \n"+
									"4 Çıkış Yap");
				System.out.println("Yapacağınız İşlemi Seçin :");
				select = scn.nextInt();
				
				if(select == 1) {
					System.out.print("Para miktarı : ");
                    int price = scn.nextInt();
                    balance += price;
					
				}else if(select ==2 ){
					System.out.println("Çekileçek Tutarı Girin :");
					int price = scn.nextInt();
					
					if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                    }
					
				}else if(select == 3) {
					System.out.println("Bakiyeniz = " + balance);
				}
				
				
			
			}while (select != 4);
				System.out.println("Tekrar görüşmek üzere.");
                break;
			}else {
				right--;
				System.out.println("Kulanıcı Adı Veya Şifreniz Hatalı !");
				
			}
			
			if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkınız : " + right);
            }
			
		}
	}

}
