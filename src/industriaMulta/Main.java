package industriaMulta;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int velocidadeAtual = leitor.nextInt();

		// TODO: Crie a condi��o necess�ria para verificar se o motorista, de acordo com
		// a entrada, foi multado ou n�o.
		if(velocidadeAtual <= 60) {
			System.out.println("Nao foi multado");
		} else {
			System.out.println("Foi multado");
		}
	}
}