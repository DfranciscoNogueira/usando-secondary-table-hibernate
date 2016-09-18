package br.com.teste.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Diego_Francisco
 *
 *Classe que faz acesso ao banco de dados
 *
 */
public class DAO {

    @SuppressWarnings("rawtypes")
    private static final ThreadLocal threadLocal = new ThreadLocal();
    @SuppressWarnings("deprecation")
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static Session getSession() {
        Session session = (Session) threadLocal.get();
        if (session == null)
            session = sessionFactory.openSession();
        return session;
    }

    public void begin() {
        getSession().getTransaction().begin();
    }

    public void commit() {
        getSession().getTransaction().commit();
    }

    public void rollback() {
        getSession().getTransaction().rollback();
    }

}
