package competec.aula2_loops;

import java.util.Scanner;

public class Desafio0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira um numero aleatório:");
		int nmrX = scanner.nextInt();

		boolean par = (nmrX % 2 == 0);

		if (par) {
			System.out.println("O número inserido é par");
		} else {
			System.out.println("O número inserido é impar");
		}

	}
}
