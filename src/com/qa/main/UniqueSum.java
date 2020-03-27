package com.qa.main;

public class UniqueSum {
	int UniqueSummer(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 0;
		}
		if (num1 == num2) {
			num1 = num2 = 0;
		}
		if (num1 == num3) {
			num1 = num3 = 0;
		}
		if (num2 == num3) {
			num2 = num3 = 0;
		}
		int sum = num1 + num2 + num3;
		return sum;
	}

}
