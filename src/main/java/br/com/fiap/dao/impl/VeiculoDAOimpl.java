package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DAOGenerico;
import br.com.fiap.entity.Veiculo;


public class VeiculoDAOimpl extends DAOGenerico<Veiculo>{
	public VeiculoDAOimpl(EntityManager em) {
		super(Veiculo.class);
		this.em=em;
	}
	
}
