package dao;

import utils.JpaConnector;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class DaoJpaModels {

    public static <T> T add(T o) {
        JpaConnector.getEntityManager().getTransaction().begin();
        o = JpaConnector.getEntityManager().merge(o);
        JpaConnector.getEntityManager().getTransaction().commit();
        return o;
    }

    public static <T> T getById(long id, Class<T> t) {
        return (T) JpaConnector.getEntityManager().find(t, id);
    }

    public static <T> void delete(T o) {
        JpaConnector.getEntityManager().getTransaction().begin();
        JpaConnector.getEntityManager().remove(o);
        JpaConnector.getEntityManager().getTransaction().commit();
    }

    public static <T> ArrayList<T> getAll(Class<T> t) {
        String query = "Select t from " + t.getSimpleName() + " t";
        TypedQuery<T> namedQuery = (TypedQuery<T>) JpaConnector.getEntityManager().createQuery(query);
        return (ArrayList<T>) namedQuery.getResultList();
    }

}
