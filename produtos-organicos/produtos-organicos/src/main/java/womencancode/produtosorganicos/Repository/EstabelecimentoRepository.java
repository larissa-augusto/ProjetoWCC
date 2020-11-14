package womencancode.produtosorganicos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import womencancode.produtosorganicos.Entity.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long>{

	Estabelecimento findById(long codigo);
}
