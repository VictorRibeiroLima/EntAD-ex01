package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Motorista;
import br.com.fiap.excecao.CommitException;

public class TesteCadastroMotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("EX01");
		EntityManager em=fabrica.createEntityManager();
		Motorista m=new Motorista(1,"Jorge",new GregorianCalendar(1999,Calendar.APRIL,11),null,Genero.M);
		MotoristaDAOimpl dao=new MotoristaDAOimpl(em);
		dao.cadastrar(m);
		try {
			dao.commit();
		} catch (CommitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		em.close();
		fabrica.close();
	}

}
