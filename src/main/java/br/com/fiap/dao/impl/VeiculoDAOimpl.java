package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public class VeiculoDAOimpl implements VeiculoDAO{
	private EntityManager em=null;
	public VeiculoDAOimpl(EntityManager em) {
		this.em=em;
	}
	public void cadastrar(Veiculo veiculo) {
		// TODO Auto-generated method stub
		em.persist(veiculo);
	}

	public void atualizar(Veiculo veiculo) {
		// TODO Auto-generated method stub
		em.merge(veiculo);
		
	}

	public void deletar(int id) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		Veiculo v=buscar(id);
		if(v==null)
			throw new SearchNotFoundException();
		em.remove(v);
	}

	public Veiculo buscar(int id) {
		// TODO Auto-generated method stub
		return em.find(Veiculo.class,id);
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
