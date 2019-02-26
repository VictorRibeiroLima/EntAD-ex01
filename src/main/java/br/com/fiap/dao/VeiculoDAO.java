package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public interface VeiculoDAO {
	public void cadastrar(Veiculo veiculo);
	public void atualizar(Veiculo veiculo);
	public void deletar(int id) throws SearchNotFoundException;
	public Veiculo buscar(int id);
	public void commit()throws CommitException;
}
