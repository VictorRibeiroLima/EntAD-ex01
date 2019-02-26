package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.entity.Motorista;

public class TesteBuscaMotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("EX01");
		EntityManager em=fabrica.createEntityManager();
		Motorista m=null;
		MotoristaDAOimpl dao=new MotoristaDAOimpl(em);
		m=dao.buscar(1);
		System.out.println(m.getId());
		em.close();
		fabrica.close();
	}

}
