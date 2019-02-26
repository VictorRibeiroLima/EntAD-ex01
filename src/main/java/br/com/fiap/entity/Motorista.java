package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="T_MOTORISTA")
public class Motorista implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8382384532098991340L;
	@Id
	@Column(name="nr_carteira")
	private int id;
	@Column(name="nm_motorista",nullable=false,length=150)
	private String nome;
	@Column(name="dt_nascimento")
	@Temporal(value=TemporalType.DATE)
	private Calendar nascimento;
	@Column(name="ft_carteira")
	@Lob
	private byte[] foto;
	@Column(name="ds_genero",length=1)
	@Enumerated(EnumType.STRING)
	private Genero genero;
	public Motorista(int id, String nome, Calendar nascimento, byte[] foto, Genero genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.genero = genero;
	}
	public Motorista() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
