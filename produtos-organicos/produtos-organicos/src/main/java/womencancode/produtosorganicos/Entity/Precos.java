package womencancode.produtosorganicos.Entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Precos")
@Table(name = "precos")
public class Precos implements Serializable {
	
	private static final long serialVersionUID = 1;
	@Id
	public Long codigo;
	
	public double valor_organico;
	
	public double valor_convencional;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public double getValor_organico() {
		return valor_organico;
	}

	public void setValor_organico(double valor_organico) {
		this.valor_organico = valor_organico;
	}

	public double getValor_convencional() {
		return valor_convencional;
	}

	public void setValor_convencional(double valor_convencional) {
		this.valor_convencional = valor_convencional;
	}

	

}
