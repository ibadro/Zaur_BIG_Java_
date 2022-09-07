package Horstmann.v1ch04;

/**
 * This program demonstrates static methods.
 * @version 1.02 2008-04-10
 * @author Cay Horstmann
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three emp objects
      var staff = new emp[3];

      staff[0] = new emp("Tom", 40000);
      staff[1] = new emp("Dick", 60000);
      staff[2] = new emp("Harry", 65000);

      // print out information about all emp objects
      for (emp e : staff)
      {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
            + e.getSalary());
      }

      int n = emp.getNextId(); // calls static method
      System.out.println("Next available id=" + n);
   }
}

class emp
{
   private static int nextId = 1;


   private String name;
   private double salary;
   private int id;

   public emp(String n, double s)
   {
      name = n;
      salary = s;
      id = 0;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getId()
   {
      return id;
   }

   public void setId()
   {
      id = nextId; // set id to next available id
      nextId++;
   }

   public static int getNextId()
   {
      return nextId; // returns static field
   }

   public static void main(String[] args) // unit test
   {
      var e = new emp("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}
