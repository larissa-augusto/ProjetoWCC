package womencancode.produtosorganicos.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import womencancode.produtosorganicos.Entity.Produtos;


public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	Produtos findById(long codigo);

		
	}

