package lojinhaDoces;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        // TODO: Crie a condi��o necess�ria para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        int qntdDoces = dinheiro * 2;
        
        System.out.println("O cliente obteve " + qntdDoces + " doces");
    }
}