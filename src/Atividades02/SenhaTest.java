package Atividades02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SenhaTest {

	/*
	 * Um teste Unitario apenas para confirmar se a quantidade de carcteres é no
	 * minimo 6
	 * 
	 */

	@Test
	void testQuantidadeCaracteres() {

		Senha senha = new Senha();


		assertEquals(6, senha.QuantidadeCaracteres("aaaaaa"));

	}

}
