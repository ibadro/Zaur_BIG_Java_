package hibernatetest;


//public class Test2 {
//
//
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml") // имя можно не писать
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("oleg", "bad ", "It", 500);
//            session.beginTransaction();
//            session.save(emp);
//       //     session.getTransaction().commit();
//
//            int myId = emp.getId();
//    //        session = factory.getCurrentSession();
//    //        session.beginTransaction();
//            Employee  employee = session.get(Employee.class, myId);
//            session.getTransaction().commit();
//
//            System.out.println(employee);
//            System.out.println("Done");
//
//        } finally {
//            factory.close();
//        }
//    }
//}
