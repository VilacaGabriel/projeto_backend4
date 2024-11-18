package com.gabriel.gerenciamento_estoque.repository;

import com.gabriel.gerenciamento_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContaining(String nome);
    List<Produto> findByFornecedor(String fornecedor);
}