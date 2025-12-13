package com.github.paivajudson.Produtos.Demo.repository;

import com.github.paivajudson.Produtos.Demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
