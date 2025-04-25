package com.ehb.enterpriseapps;

public class PrimeCalculator {
	public static void calculator() {
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
