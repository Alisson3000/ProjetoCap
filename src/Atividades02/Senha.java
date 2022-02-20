package Atividades02;
public class Senha {

	private String senha;
	private Integer numeroCaracteres = 0;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {

		this.senha = senha;
	}

	public int getNumeroCaracteres() {
		return numeroCaracteres;
	}

	public void setNumeroCaracteres(int numeroCaracteres) {
		this.numeroCaracteres = numeroCaracteres;
	}

	/*
	 * Metodo no qual ira percorrer todos caracteres da senha digitada e ira
	 * verificar se a mesma possui mais de 6 cacteres
	 */
	public Integer QuantidadeCaracteres(String senha) {
		int quantidadeMinimaCaracteres = 6;

		/*
		 * a senha.length vai percorrer todos caracteres da senha e
		 * "if (senha.charAt(i)" != ' ') era verificar se a senha nao possui nenhum
		 * caracterer em branco caso nao possua nenhum caracter em branco ira fazer a
		 * contagem desses caracteres
		 */
		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) != ' ') {
				numeroCaracteres++;
			}
		}
		/*
		 * apos a contagem dos caracteres essa condição IF ira verificar se a quantidade
		 * digitada é menor do que o minumo estipulado, se for menor ira imprimir no
		 * console uma mensagem informando a quantidade necessaria para que a senha
		 * atinja aos requisitos  de 6 caracteres
		 */
		if (numeroCaracteres < quantidadeMinimaCaracteres) {
			quantidadeMinimaCaracteres -= numeroCaracteres;
			System.out.println();
			System.out.println("quantidade de caracteres restantes para senha segura = " + quantidadeMinimaCaracteres);
		}
		return quantidadeMinimaCaracteres;
	}

	/*
	 * Este metodo ira verificar se a senha possui todos requistos restantes para
	 * que a senha seja segura
	 */
	public void Criterios(String senha) {
		/*
		 * criação de 4 vetores com os criterios, Letra miniscula, maiscula, caracter
		 * especial e digito
		 */
		char[] especial = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };
		char[] minusculos = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'x', 'w', 'y', 'z' };
		char[] maiusculos = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'X', 'W', 'Y', 'Z' };
		char[] digitos = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

		// variaveis para contagem
		int minusculo = 0;
		int digito = 0;
		int caractereEspecial = 0;
		int maiusculo = 0;
		/*
		 * Aqui foi criado 5 estrutura de repetição for, 4 para percorrer os vetores e
		 * um for para percorrer todos caracteres da senha digitada
		 */
		for (int i = 0;  i < especial.length;    i++) {
			for (int a = 0; a < minusculos.length; a++) {
				for (int b = 0; b < maiusculos.length; b++) {
					for (int c = 0; c < digitos.length; c++) {
						for (int j = 0; j < senha.length(); j++) {
							/*
							 * apos os for percorrerem os vetores e a senha digitada, foi criado 4 ifs, que
							 * ira comparar se a senha digitada possui algum caracter igual aos valores dos
							 * vetores, se possuir ira incluir na variavel para contagem
							 */
							if (senha.charAt(j) == especial[i]) {						
								caractereEspecial++;						
							}
							if (senha.charAt(j) == minusculos[a]) {
								minusculo++;
							}
							if (senha.charAt(j) == maiusculos[b]) {
								maiusculo++;
							}
							if (senha.charAt(j) == digitos[c]) {
								digito++;
							}
						}
					}
				}
			}
		}
		/*
		 * abaixo TESTE UNITARIO que ira verificar se na contagem dos caracteres especiais,
		 * minusculo, maisculo e digito, possuem valores maiores que 0 para que a senha
		 * esteja dentro das regras
		 */
		if (caractereEspecial > 0 && digito > 0 && minusculo > 0 && maiusculo > 0) {
			System.out.println();			
		} else
			System.out.println(
					"senha nao corresponde a uma das regras de segurança (Letra maiuscula, miniscula, caracter especial e digito)");
		}
	}

