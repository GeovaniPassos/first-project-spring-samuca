package br.com.cursodeprogramacao1.first_project_cursodeprogramacao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class FirstProjectCursodeprogramacaoApplicationTests {

	private BigDecimal meuSalario = new BigDecimal("10.00");

	@Test
	void contextLoads() {
		System.out.println("Começando o debbugs");
		System.out.println("O salário de programador é " + meuSalario);
		System.out.println("Fim do debug!");
	}
}
