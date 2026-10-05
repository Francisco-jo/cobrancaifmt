package edu.ifmt.cobrancaifmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ifmt.cobrancaifmt.model.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {
    // O Spring Data JPA já fornece automaticamente métodos como save(), findById(), delete(), etc.
}