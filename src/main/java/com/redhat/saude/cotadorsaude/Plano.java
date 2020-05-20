package com.redhat.saude.cotadorsaude;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Plano implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Identificador do Plano")
	private java.lang.Integer idPlano;
	@org.kie.api.definition.type.Label(value = "Nome do Plano")
	private java.lang.String nome;
	@org.kie.api.definition.type.Label(value = "Valor do Plano")
	private java.lang.Double valor;

	public Plano() {
	}

	public java.lang.Integer getIdPlano() {
		return this.idPlano;
	}

	public void setIdPlano(java.lang.Integer idPlano) {
		this.idPlano = idPlano;
	}

	public java.lang.String getNome() {
		return this.nome;
	}

	public void setNome(java.lang.String nome) {
		this.nome = nome;
	}

	public java.lang.Double getValor() {
		return this.valor;
	}

	public void setValor(java.lang.Double valor) {
		this.valor = valor;
	}

	public Plano(java.lang.Integer idPlano, java.lang.String nome,
			java.lang.Double valor) {
		this.idPlano = idPlano;
		this.nome = nome;
		this.valor = valor;
	}

}