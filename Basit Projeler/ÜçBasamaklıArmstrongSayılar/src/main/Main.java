package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		
		for(int i = 100 ; i <= 999;  i++) {
			int number = i ;
			int basNumber = 0;
			int  tempNumber = number;
			int basValue;
			int result = 0;
			int basPow;
			
		while(tempNumber != 0) {
			tempNumber /= 10;
			basNumber++;
		}
		
		tempNumber = number;
		while(tempNumber != 0) {
			basValue = tempNumber % 10;
			basPow = 1;
			for(int i2 = 1 ; i2 <= basNumber ; i2 ++) {
				basPow *= basValue;
			}
			result += basPow;
			tempNumber /= 10;
		}
		
		if (result == number) {
			System.out.println(number);
		}
	}
	}
	
}
