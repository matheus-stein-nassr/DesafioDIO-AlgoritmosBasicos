package mesadaDoSobrinho;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) { 
         Scanner leitor = new Scanner(System.in);
         int entrada = leitor.nextInt();
         int mesada = 50;

         System.out.println(calcular(entrada, mesada));
     }
     public static int calcular (int entrada, int mesada) {
         int valorTotal = 0;
         valorTotal = (mesada * entrada);
         return valorTotal;
         }
}