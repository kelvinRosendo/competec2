package competec.aula2_loops;

public class Desafio11 {
	public static void main(String[] args) {
		int soma = 0; // inicialmente a soma é zero.
		int i = 0;

		// crie um loop que atualize o valor de soma 100 vezes
		while (i <= 100) {
		soma = soma + i;
		i++;

		};

		// imprima o valor da soma 
		System.out.println(soma);
	}

}
