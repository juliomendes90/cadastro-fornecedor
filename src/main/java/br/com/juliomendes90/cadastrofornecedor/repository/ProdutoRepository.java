package br.com.juliomendes90.cadastrofornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.juliomendes90.cadastrofornecedor.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String> {

}
