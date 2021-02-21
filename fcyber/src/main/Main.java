package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//demo olarak vergi hesaplaması kodları ben fcyber saygılarımla...
		Scanner input = new Scanner(System.in);

		double gelir, v, v1, v2, v3, v4, v5;

		System.out.println("|Vergi hesaplama ekrani|");
		System.out.println("Gelir miktarınız (TL): ");

		gelir = input.nextDouble();

		v1 = 150000000 * 0.25;
		v2 = 300000000 * 0.30;
		v3 = 600000000 * 0.35;
		v4 = 1200000000 * 0.40;

		if (gelir <= 150000000) // gelir<=15.. 0.25 le çarp (%25 demek)
			v = gelir * 0.25;
		else if (gelir <= 300000000)
			v = v1 + (gelir - 150000000) * 0.3;
		else if (gelir <= 600000000)
			v = v1 + v2 + (gelir - 300000000) * 0.35;
		else if (gelir <= 1200000000)
			v = v1 + v2 + v3 + (gelir - 600000000) * 0.4;
		else
			v = v1 + v2 + v3 + v4 + (gelir - 1200000000) * 0.5;

		System.out.println("Odemeniz gereken vergi: " + v);
	}

}
