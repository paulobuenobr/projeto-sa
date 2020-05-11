package br.sc.senai.dao;

import br.sc.senai.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioDaoTest {

    private static EntityManagerFactory factory;
    private static EntityManager entityManager;

    public static void main(String[] args) {

        factory = Persistence.createEntityManagerFactory("sa-db");

        entityManager = factory.createEntityManager();

        insert();

        // login(usuario);

        entityManager.close();
        factory.close();

    }

    public static void insert() {

        entityManager.getTransaction().begin();

        Usuario usuario = new Usuario();
        // TODO implementar email
        // usuario.setEmail("jose.bueno@gmail.com");
        usuario.setNome("José Bueno");
        usuario.setSenha("lalala");

        entityManager.persist(usuario);

        entityManager.getTransaction().commit();

    }


    // TODO Implementar login retornando true ou false. Usar a Named Query.
    public static boolean login(Usuario usuario) {
        return false;
    }

}
