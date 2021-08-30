
package org.generation.minhalojadegames.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")
public class Produto {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;


@NotNull(message = "O atributo título é Obrigatório!") 
@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
private String nome;

@NotNull(message = "O atributo título é Obrigatório!") 
@Size(min = 5, max = 100000000, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
private String descricao;
@NotNull
@Positive
private BigDecimal preco;

@NotNull
@Positive
private int quantidade;



public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getDescricao() {
	return descricao;
}


public void setDescricao(String descricao) {
	this.descricao = descricao;
}


public BigDecimal getPreco() {
	return preco;
}


public void setPreco(BigDecimal preco) {
	this.preco = preco;
}


public int getQuantidade() {
	return quantidade;
}


public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}


public List<Categoria> getCategoria() {
	return categoria;
}


public void setCategoria(List<Categoria> categoria) {
	this.categoria = categoria;
}


@OneToMany (mappedBy = "produto", cascade = CascadeType.ALL)
@JsonIgnoreProperties("produto")
private List<Categoria>categoria;
	
}
