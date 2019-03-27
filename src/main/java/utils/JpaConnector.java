package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaConnector {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("MySql");

    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
