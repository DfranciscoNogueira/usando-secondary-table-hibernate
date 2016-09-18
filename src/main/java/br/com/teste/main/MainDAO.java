package br.com.teste.main;

import java.util.List;

import org.hibernate.Query;

import br.com.teste.bean.Pessoa;
import br.com.teste.dao.DAO;

/**
 * 
 * @author Diego_Francisco
 *
 */
public class MainDAO extends DAO {

    public static void main(String[] args) {

        List<Pessoa> pessoas = findPessoas();

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome : " + pessoa.getNome());
            System.out.println("SobreNome : " + pessoa.getSobrenome());
        }
    }

    // obs usando HQL
    @SuppressWarnings("unchecked")
    public static List<Pessoa> findPessoas() {
        Query query = getSession().createQuery("FROM Pessoa");
        return query.list();
    }
}
