package br.com.cursodeprogramacao1.first_project_cursodeprogramacao.request;

import jakarta.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Salarios {

    private BigDecimal meuSalario = new BigDecimal("10.00");

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
    path = "salario-programador", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getSalarioProgramador() {
        System.out.println("Começando o debbugs");
        System.out.println("O salário de programador é " + meuSalario);
        System.out.println("Fim do debug!");
        return new ResponseEntity<>(meuSalario, HttpStatus.OK);
    }
}
