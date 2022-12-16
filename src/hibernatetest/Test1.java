package hibernatetest;
//
//
//public class Test1 {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml") // имя можно не писать
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("ilnur", "bad ", "It", 500);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//            System.out.println("Done");
//            System.out.println(emp);
//        } finally {
//            factory.close();
//        }
//    }
//}