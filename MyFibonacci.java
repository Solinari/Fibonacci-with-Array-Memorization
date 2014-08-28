// Justin Tyme Dejesus
// CSC 300 - HW 2
// 01/30/2014

import java.util.Scanner;

public class MyFibonacci {

	public static void message() {

		String msg = "You will be prompted for a number N\n"
				+ "N must be an integer 1 or greater\n"
				+ "I will then compute the next 2*N fibonacci numbers\n";

		System.out.println(msg);
		System.out.println();
	}

	public static int Fib(int n) {

		if (n <= 1) {
			return 1;

		} else {
			System.out.println(n);
			return Fib(n - 1) + Fib(n - 2);
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		message();
		System.out.println("Enter a number for N: ");
		int N = input.nextInt();
		input.close();

		long[][] FiboList = new long[N][2];
		// to store SUPER HUGE numbers switch to double
		// double[][] FiboList = new double[N][2];

		for (int i = 1; i < FiboList.length; i++) {

			if (i == 1) {
				Fib(i);
				FiboList[i - 1][0] = Fib(i - 2);
				FiboList[i - 1][1] = Fib(i - 1);
				FiboList[i][0] += FiboList[i - 1][0] + FiboList[i - 1][1];
				FiboList[i][1] += FiboList[i - 1][1] + FiboList[i][0];

				System.out.println(FiboList[i - 1][0]);
				System.out.println(FiboList[i - 1][1]);
				System.out.println(FiboList[i][0]);
				System.out.println(FiboList[i][1]);

			}
			if (i > 1) {
				FiboList[i][0] += FiboList[i - 1][0] + FiboList[i - 1][1];
				FiboList[i][1] += FiboList[i - 1][1] + FiboList[i][0];

				System.out.println(FiboList[i][0]);
				System.out.println(FiboList[i][1]);
			}
		}

	}

}
