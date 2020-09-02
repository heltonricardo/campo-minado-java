package io.github.heltonricardo.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {

	private Campo campo;
	
	// O @BeforeEach � executado antes de cada fun��o a ser testada
	@BeforeEach
	void inicializar() {
		 campo = new Campo(5, 5);
	}
	
	// O @Test deve ser informado para que essa fun��o seja testada
	@Test
	void testeVizinhoReal() {
		// O assertAll exibe informa��es detalhadas de cada teste dentro dele
		assertAll(
				() -> assertTrue(campo.adicionarVizinho(new Campo(4, 4))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(4, 5))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(4, 6))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(5, 4))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(5, 6))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(6, 4))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(6, 5))),
				() -> assertTrue(campo.adicionarVizinho(new Campo(6, 6)))
		);
	}
	
	
}
