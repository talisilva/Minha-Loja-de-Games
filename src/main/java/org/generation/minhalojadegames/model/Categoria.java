package org.generation.minhalojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "tb_categoria")
public class Categoria {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id; 

@NotNull(message = "O atributo setor é Obrigatório!") 
@Size(max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
private String setor;
@Size( max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
private String genero;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getSetor() {
	return setor;
}
public void setSetor(String setor) {
	this.setor = setor;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
@ManyToOne
@JsonIgnoreProperties("Categoria")
private Produto produto;

	
	
	

}
