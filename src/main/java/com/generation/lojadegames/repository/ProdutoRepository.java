package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
        List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
