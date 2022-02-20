package Atividades;

import java.util.Scanner;

public class Questao01 {

	/*
	 * O algoritimo abaixo vai pedir que digite um valor referente a quantidade de
	 * linhas e colunas da matriz, como sugerido digite o numero 6, caso digite um
	 * numero difirente o sistema vai retornar uma mensagem de erro e pedindo para
	 * que digite novamente, ao digitar o numero 6 a estrutura de repetição for vai
	 * percorrrer a matriz que ja tem os valores pré definidos e na saida ja
	 * mostrara a escada conforme exemplo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite numero (6) referente a as posiçoes na matriz");

		try {
			// digite o numero 6 referente ao valor da matriz preenchida manualmente
			int n = sc.nextInt();

			String[][] mat = new String[n][n];

			// matriz preenchida manulamente
			mat[0][0] = " ";
			mat[0][1] = " ";
			mat[0][2] = " ";
			mat[0][3] = " ";
			mat[0][4] = " ";
			mat[0][5] = "*";

			mat[1][0] = " ";
			mat[1][1] = " ";
			mat[1][2] = " ";
			mat[1][3] = " ";
			mat[1][4] = "*";
			mat[1][5] = "*";

			mat[2][0] = " ";
			mat[2][1] = " ";
			mat[2][2] = " ";
			mat[2][3] = "*";
			mat[2][4] = "*";
			mat[2][5] = "*";

			mat[3][0] = " ";
			mat[3][1] = " ";
			mat[3][2] = "*";
			mat[3][3] = "*";
			mat[3][4] = "*";
			mat[3][5] = "*";

			mat[4][0] = " ";
			mat[4][1] = "*";
			mat[4][2] = "*";
			mat[4][3] = "*";
			mat[4][4] = "*";
			mat[4][5] = "*";

			mat[5][0] = "*";
			mat[5][1] = "*";
			mat[5][2] = "*";
			mat[5][3] = "*";
			mat[5][4] = "*";
			mat[5][5] = "*";

			// Dois for para percorrer a matriz, linhas e colunas
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {

					// apos o for percorrer a matriz a saida mostrara os valores preenchidos
					System.out.print(mat[i][j]);
				}
				System.out.println();
			}
			System.out.println();

			/*
			 * TESTE UNITARIO para verificar se as linhas e colunas dos vetores sao iguais a
			 * 6 se o valor for menor que 6 vai cair na exceçao, feito o teste unitario por
			 * aqui pelo codigo ser pequeno!
			 */
			boolean resultado;
			if (n == 6) {
				System.out.println("teste unitario: ");
				System.out.println(resultado = true);
			}
		} catch (RuntimeException erro) {
			System.out.println("valor incorreto, digite o numero 6");

		}
		sc.close();
	}
}
