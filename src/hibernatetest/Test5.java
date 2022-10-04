package hibernatetest;

import hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml") // имя можно не писать
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
// udalenie
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
session.createQuery("delete Employee where   name ='ilnur'").executeUpdate();

            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}
