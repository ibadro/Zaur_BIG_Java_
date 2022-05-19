
package Lesson27;

import java.util.*;

public class Test14 {
    
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        
        // виды Exception
        
//        System.out.println(list.get(3)); // java.lang.IndexOutOfBoundsException 
//        System.out.println(2/0); // java.lang.ArithmeticException

        Doctor d = new Doctor();
        Teacher t = new Teacher();

        Employee [] arr1 = {d, t};
        
//      Teacher t2 = (Teacher)arr1[0]; // java.lang.ClassCastException
        // потому что Teacher t2 и Doctor d не связаны, они связаны с Employee, они его дети
        // между тычером и доктором НЕТ IS-A СВЯЗИ
        
        Test14 test = new Test14();
//      test.createPwd("12345"); // IllegalArgumentException: length is too short
//      test.createPwd("1234567890123456"); // IllegalArgumentException: length is too long
        test.createPwd("fds12345");
        
        
        
        Samolet sam = new Samolet();
        sam.ozhidat();
        sam.let(); 
//        sam.otmena(); // IllegalStateException: samolet uzhe v vozduxe

        
//        Integer.parseInt("22gg"); // NumberFormatException: For input string: "22gg"
        
        

    }
    
    public void createPwd(String pwd){
    
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("length is too short");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("length is too long");
        }
        else{
            System.out.println("password is good");
        }
    }
    
}

class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}

class Samolet{
    
    String sost = "v ozhidanii";
    
    public void let(){
    
        sost = "v vozduxe";
        System.out.println("samolet letit");
        
    }
    
    public void ozhidat(){
        
        if (sost.equals("v vozduxe")) {
            throw new IllegalStateException("samolet uzhe v vozduxe");
        } else {
            sost = "v ozhidanii";
            System.out.println("samolet v ozhidanii");
        }

    }
    
    public void otmena(){
        
        if (sost.equals("v vozduxe")) {
            throw new IllegalStateException("samolet uzhe v vozduxe");
        } else {
            sost = "otmena";
            System.out.println("samolet otmenen");
        }

    }
    
}