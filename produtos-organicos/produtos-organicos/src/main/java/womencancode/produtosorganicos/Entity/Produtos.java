package womencancode.produtosorganicos.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Produtos")
@Table(name = "nomes_produtos")
public class Produtos implements Serializable{
	
		private static final long serialVersionUID = 1;
		@Id
		public Long codigo;
		
		@Column(nullable = false, length = 50)
		public String categoria;
		
		@Column(nullable = false, length = 50)
		public String nome_produto;
		
		public Long getCodigo() {
			return codigo;
		}

		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getNome_produto() {
			return nome_produto;
		}

		public void setNome_produto(String nome_produto) {
			this.nome_produto = nome_produto;
		}

		
		
		
}
