package leituraGertrudes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int paginas = leitor.nextInt();
		int paginasLidas = 3;

		// TODO: Crie a condi��o necess�ria para que Getrudes saiba em quanto tempo
		// terminar� seus livros
		
		// int dias = paginas / paginasLidas;
		
		System.out.println((paginas/paginasLidas) + " dias");

	}
}