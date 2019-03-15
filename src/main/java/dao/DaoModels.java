package dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import utils.HibernateConnector;
import java.util.ArrayList;

public class DaoModels {

    public static void create(Object o){
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
    }

    public static void update(Object o) {
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Object o) {
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    public static <T> T getById(long id, T t) {
        Class<?> cls = t.getClass();
        Session session = HibernateConnector.getSession();
        T oTmp = (T) session.get(cls, id);
        session.close();
        return oTmp;
    }

    public static <T> ArrayList<T> getAll(T t) {
        Class<?> cls = t.getClass();
        Session session = HibernateConnector.getSession();
        Criteria criteria = session.createCriteria(cls);
        ArrayList<T> tmp = (ArrayList<T>) criteria.list();
        return tmp;
    }

}
