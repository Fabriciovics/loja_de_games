package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
        List<Produto> findAllByNomeContainingIgnoreCase(String nome);
        List<Produto> findByPrecoLessThan(BigDecimal preco);
        List<Produto> findByPrecoGreaterThan(BigDecimal preco);
}
