package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class KdvTutarHesaplamasi {
	public static void main(String[] args) {
		SpringApplication.run(KdvTutarHesaplamasi.class, args);
		double tutar,kdvOran = 0.18, kdvTutar, kdvliTutar;
		Scanner input = new Scanner(System.in);
		System.out.print("Ücret Tutarını Giriniz : ");
		tutar = input.nextDouble();
		kdvTutar = tutar * kdvOran;
		kdvliTutar = kdvTutar + tutar;

		System.out.println("KDV Oranı : " + kdvOran + " %");
		System.out.println("KDV Tutarı : " + kdvTutar + " TL");
		System.out.println("KDV'siz Tutar : " + tutar + " TL");
		System.out.println("KDV'li Tutar : " + kdvliTutar + " TL");

	}



}
