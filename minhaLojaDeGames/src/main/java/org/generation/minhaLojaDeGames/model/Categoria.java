package org.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name =  "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 4, max = 20)
	private String tipo;
	
	@NotNull
	@Size(min = 4, max = 20)
	private String genero;
	
	@NotNull
	@Size(min = 4, max = 20)
	private String class_Indicativa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClass_Indicativa() {
		return class_Indicativa;
	}

	public void setClass_Indicativa(String class_Indicativa) {
		this.class_Indicativa = class_Indicativa;
	}
	
	
	
	

}
