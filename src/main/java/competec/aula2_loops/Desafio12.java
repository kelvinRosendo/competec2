package competec.aula2_loops;

import java.util.Scanner;

public class Desafio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String senha = "Nivlek_8002"; // esta é a senha correta
		String tentativa = "";
		//deu certo barai 
		// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.
		do {
		System.out.println("Olá usuário, insira sua senha:" );
		tentativa =	scanner.nextLine();
		} while (!senha.equals(tentativa));

		if (senha.equals(tentativa))
			System.out.println("senha correta, Bem-vindo Kelvin");
		else
			System.out.println("Senha ínvalida, tente novamente");


	}
}
