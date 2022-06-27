package com.examples;

import java.util.Scanner;

public class _22x5_Palindrom {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String kelime = klavye.nextLine();
		
		boolean check = checkIfPalindrom(getReverse(kelime));
		if (check) {
			System.out.println("Girilen kelime palindrom ");
		} else {
			System.out.println("Girilen kelime palindrom değildir." + "Girilen kelime :" + kelime);
		}
		
	}
	
	public static String getReverse(String klavye) {
		
		StringBuilder builder = new StringBuilder();
		String reverse = builder.append(klavye).reverse().toString();
		return reverse;
	}
	
	public static boolean checkIfPalindrom(String klavye) {
		if (getReverse(klavye).equals(klavye)) {
			
			return true;
		}
		return false;
		
	}
	
	public static String getReverse2(String klavye) {
		String reverseWord = "";
		
		for (int i = klavye.length() - 1; i >= 0; i--) {
			reverseWord += klavye.charAt(i);
			
		}
		return reverseWord;
	}
	
}
