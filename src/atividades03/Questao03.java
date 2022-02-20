package atividades03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		// BASTA EXECUTAR O PROGRAMA NAO PRECISA DIGITAR NADA

		/*
		 * provavel que nao esteja certo, usei o exemplo da palavra OVO, divide ela em
		 * duas substring coloquei tudo em letra minuscula, transformei em um array de
		 * char, depois coloquei em ordem alfabetica e depois atraves de um for fiz a
		 * comparação se as palavras sao iguais.
		 */

		Scanner sc = new Scanner(System.in);

		String palavra = "ovo";

		// passando a palavra para minuscula
		palavra = palavra.toLowerCase();
		
		System.out.println("Entrada: " + palavra);

		// colocando a palavra em um array de char em forma de substring
		char[] String1 = palavra.substring(0, 2).toCharArray();
		char[] String2 = palavra.substring(1, 3).toCharArray();

		// ordem alfabetica
		Arrays.sort(String1);
		Arrays.sort(String2);

		// fazendo a comparação se as palavra sao iguais para que o anagrama esteja
		// correto
		int cont = 0;
		for (int i = 0; i < String1.length; i++) {
			if (Arrays.equals(String1, String2)) {
				cont++;
			} else {
				System.out.println("nao é anagrama");
			}
		}
		System.out.println();
		System.out.println("Saida: " + cont);

		/* teste unitario para conferir se as duas strings sao do mesmo tamanho caso
		haja alteração*/ 
		if (String1.length != String2.length) {
			System.out.println("não é anagrama");
		}

		sc.close();

	}

}
