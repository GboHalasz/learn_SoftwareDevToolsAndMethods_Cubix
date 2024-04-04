package hu.cubix.sfdevtools.fibonacci;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.cubix.sfdevtools.fibonacci.service.FibonacciCalculator;

@SpringBootApplication
public class FibonacciApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FibonacciApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		int n = 10;
		System.out.println("A " + n + ". fibonacci elem: " + FibonacciCalculator.getNthFibonacciNumber(n));	
		
	}
}