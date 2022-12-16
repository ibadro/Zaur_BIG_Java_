package hibernatetest;



import java.util.List;

// получение работника и изменение его
//public class Test4 {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml") // имя можно не писать
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//        try {
//
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
////            Employee employee = session.get(Employee.class, 1);
////            employee.setSalary(1500);
//            session.createQuery("update Employee set salary =1000" +
//                    " where  name ='ilnur'").executeUpdate();
//
//                    session.getTransaction().commit();
//
//
//        } finally {
//            factory.close();
//        }
//    }
//}
