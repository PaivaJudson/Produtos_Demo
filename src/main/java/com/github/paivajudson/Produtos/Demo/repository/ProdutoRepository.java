package com.github.paivajudson.Produtos.Demo.repository;

import com.github.paivajudson.Produtos.Demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
