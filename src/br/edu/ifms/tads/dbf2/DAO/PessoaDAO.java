package br.edu.ifms.tads.dbf2.DAO;

import org.hibernate.Session;

import br.edu.ifms.tads.dbf2.util.HibernateUtil;

public class PessoaDAO {
	public void salvar(){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		  	session.beginTransaction();
			//session.save(this.pessoa);
			session.getTransaction().commit();
	}
}
