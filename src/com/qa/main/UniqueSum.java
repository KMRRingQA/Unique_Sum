package com.qa.main;

public class UniqueSum {
	int UniqueSummer(int Num1, int Num2, int Num3) {
		if (Num1 == Num2 && Num2 == Num3) {
			return 0;
		}
		if (Num1 == Num2) {
			Num1 = Num2 = 0;
		}
		if (Num1 == Num3) {
			Num1 = Num3 = 0;	
		}
		if (Num2 == Num3) {
			Num2 = Num3 = 0;
		}
		int sum = Num1 + Num2 + Num3;
		return sum; 
	}

}
