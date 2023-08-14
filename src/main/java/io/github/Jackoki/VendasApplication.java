package io.github.Jackoki;

import io.github.Jackoki.domain.entity.Cliente;
import io.github.Jackoki.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Kenji"));
            clientes.save (new Cliente("Outro cliente"));

            boolean existe = clientes.existsByNome("Kenji");
            System.out.println("Existe um cliente com o nome Kenji? " + existe);

        };

    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

