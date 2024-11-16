package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class PessoaTeste {

	
	
	@Test
	void deveCalcularCorretamente() {
		Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0));
		assertEquals(24, jessica.getIdade());
	}

}
