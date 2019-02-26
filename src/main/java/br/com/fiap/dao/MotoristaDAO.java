package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public interface MotoristaDAO {
	public void cadastrar(Motorista motorista);
	public void atualizar(Motorista motorista);
	public void deletar(int id) throws SearchNotFoundException;
	public Motorista buscar(int id);
	public void commit()throws CommitException;
}
