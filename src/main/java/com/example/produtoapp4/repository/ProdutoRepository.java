package com.example.produtoapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.produtoapp4.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

