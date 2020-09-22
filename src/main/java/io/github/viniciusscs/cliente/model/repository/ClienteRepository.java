package io.github.viniciusscs.cliente.model.repository;

import io.github.viniciusscs.cliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
