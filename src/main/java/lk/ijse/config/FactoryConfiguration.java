package lk.ijse.config;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration config = new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory = config.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration == null? new FactoryConfiguration(): factoryConfiguration);
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
