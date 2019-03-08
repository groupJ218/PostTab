package utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnector {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (HibernateException hibex) {
                hibex.printStackTrace();
            }
        return sessionFactory;
    }

    public static void sessionFactoryShutdown() {
        getSessionFactory().close();
    }

    public static Session getSession() {
        if (getSessionFactory()==null) System.out.println("SessionFactory is null");
        Session session = getSessionFactory().openSession();
        if (session == null) {
            System.err.println("Session is Null");
        }
        return session;
    }
}
