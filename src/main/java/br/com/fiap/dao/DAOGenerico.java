package br.com.fiap.dao;



import javax.persistence.EntityManager;

import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public abstract class DAOGenerico <T>{
	protected EntityManager em;
	private Class<T> classe;
	protected DAOGenerico() {
		
	}
	protected DAOGenerico(Class<T> classe) {
		this.classe=classe;
	}
	public void cadastrar(T entidade) {
		em.persist(entidade);
	}
	public void atualizar(T entidade) {
		em.merge(entidade);
	}
	public void deletar(int id) throws SearchNotFoundException{
		T entidade=buscar(id);
		if(entidade==null)
			throw new SearchNotFoundException();
		em.remove(entidade);
	}
	public T buscar(int id) {
		return em.find(classe, id);
	}
	public void commit()throws CommitException{
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
}
