package womencancode.produtosorganicos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import womencancode.produtosorganicos.Entity.Precos;

public interface PrecosRepository extends JpaRepository<Precos, Long>{

	Precos findById(long codigo);
}
