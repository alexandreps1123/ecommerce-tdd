package br.com.parkus.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientesTests {
    
    @Test
    void validarPropriedadesClientes() {
        Cliente cliente = new Cliente();

        cliente.setNome("Alexandre");
        cliente.setEmail("alexandre@email.com");
        cliente.setSenha("123456789");
        cliente.setEndereco("Enderececoso");
        cliente.setNumero("Numeroso");
        cliente.setBairro("Barroso");
        cliente.setCidade("Cidadosa");
        cliente.setEstado("Estadoso");
        cliente.setCep("12345-678");
        cliente.setComplemento("Complementoso enderecoso");

        assertEquals("Alexandre", cliente.getNome());
        assertEquals("alexandre@email.com", cliente.getEmail());
        assertEquals("123456789", cliente.getSenha());
        assertEquals("Enderececoso", cliente.getEndereco());
        assertEquals("Numeroso", cliente.getNumero());
        assertEquals("Barroso", cliente.getBairro());
        assertEquals("Cidadosa", cliente.getCidade());
        assertEquals("Estadoso", cliente.getEstado());
        assertEquals("12345-678", cliente.getCep());
        assertEquals("Complementoso enderecoso", cliente.getComplemento());
    }
}
