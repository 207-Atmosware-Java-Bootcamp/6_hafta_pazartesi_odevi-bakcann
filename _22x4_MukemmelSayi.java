package com.examples;

import java.util.Scanner;

public class _22x4_MukemmelSayi {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("Bir sayi giriniz: ");
		int number = klavye.nextInt();
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (number == total) {
			System.out.println(number + " Mukemmel bir sayidir");
		} else {
			System.out.println(number + " Mukemmel sayi değildir.Tekrar deneyiniz.");
		}
	}
	
}
