package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DAOGenerico;
import br.com.fiap.entity.Motorista;


public class MotoristaDAOimpl extends DAOGenerico<Motorista> {

	public MotoristaDAOimpl(EntityManager em) {
		super(Motorista.class);
		this.em=em;
	}

}
