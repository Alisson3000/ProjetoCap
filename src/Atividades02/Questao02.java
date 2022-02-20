package Atividades02;


import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		/*
		 * Classe executavel(basta executar o programa e digitar a senha), aqui o
		 * usuario ira digitar a senha, cumprindo todos requisitos exigidos, caso a
		 * senha possua menos de 6 caracteres ira aparece uma mensagem com essa
		 * informação e na frente a quantidade de caracteres que faltam para atingir o
		 * minimo de 6 caracteres, se o usuario também não digitar a senha com todas as
		 * regras exigidas para que a mesma seja considerada forte, o sistema ira
		 * mostrar uma mensagem de erro informando que a senha nao corresponde a uma das
		 * regras, SE digitar corretamente o sistema ira apenas encerrar
		 */

		Scanner sc = new Scanner(System.in);

		/* instanciando um novo Objeto da classe Senha */
		Senha senhas = new Senha();

		// digitando a senha no console
		String senha = sc.nextLine();

		/*
		 * chamando os metodos da classe senha para verificar se a senha esta dentro das
		 * regras e segura.
		 */
		senhas.Criterios(senha);
		senhas.QuantidadeCaracteres(senha);

		/*
		 * condição que ira permitir que o usuario digite a senha novamente caso a senha
		 * possua menos de 6 caracteres
		 */
		int quantidadeMinimaCaracteres = 6;
		if (senhas.getNumeroCaracteres() < quantidadeMinimaCaracteres) {
			System.out.println("Digite a senha novamente: ");
			senha = sc.nextLine();
			System.out.println();
			senhas.Criterios(senha);
			senhas.QuantidadeCaracteres(senha);
		}

		sc.close();

	}

}
