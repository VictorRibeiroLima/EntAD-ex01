package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public class MotoristaDAOimpl implements MotoristaDAO {
	private EntityManager em=null;
	public MotoristaDAOimpl(EntityManager em) {
		this.em=em;
	}
	public void cadastrar(Motorista motorista) {
		// TODO Auto-generated method stub
		em.persist(motorista);
	}

	public void atualizar(Motorista motorista) {
		// TODO Auto-generated method stub
		em.merge(motorista);
		
	}

	public void deletar(int id) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		Motorista m=buscar(id);
		if(m==null)
			throw new SearchNotFoundException();
		em.remove(m);
	}

	public Motorista buscar(int id) {
		// TODO Auto-generated method stub
		return em.find(Motorista.class,id);
	}

	public void commit() throws CommitException {
		// TODO Auto-generated method stub
		try {
		em.getTransaction().begin();
		em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
}
