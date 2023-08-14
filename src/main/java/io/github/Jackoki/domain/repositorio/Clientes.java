package io.github.Jackoki.domain.repositorio;

import io.github.Jackoki.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> {
    List<Object> findByNomeLike(String cli);

    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);

    boolean existsByNome(String nome);
}
