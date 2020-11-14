package womencancode.produtosorganicos.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Estabelecimento")
@Table(name = "Estab")
public class Estabelecimento implements Serializable {
	
	private static final long serialVersionUID = 1;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public Long codigo;
	
	@Column(nullable = false, length = 50)
	public String nome;
	
	@Column(nullable = false, length = 50)
	public String endereco;
	
	@Column(nullable = false, length = 12)
	public String telefone;
	
	@Column(nullable = false, length = 50)
	public String email;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
	
}
