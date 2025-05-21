package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAllByTituloContainingIgnoreCase(String titulo);

}
