package hu.cubix.sfdevtools.fibonacci.service;

public class FibonacciCalculator {
	public static int getNthFibonacciNumber(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
	}
}
