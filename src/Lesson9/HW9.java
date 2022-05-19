
package Lesson9;
    

public class HW9 {

    String name;
    int age;
    
    HW9 (String name, int age) {
    
        this.name = name;
        this.age = age;
    
    }
    
}

class HW9Test {

    public static void main(String[] args) {
        
        HW9 obj1 = new HW9("Bik", 31);
        HW9 obj2 = new HW9("Nik", 24);
        HW9 obj3 = new HW9("Vic", 43);
        HW9 obj4 = new HW9("Mik", 19);
        HW9 obj5 = new HW9("Dik", 51);
        HW9 obj6 = new HW9("Pik", 21);
        HW9 obj7 = new HW9("Gik", 38);
        HW9 obj8 = new HW9("Ric", 26);
        
        // delete references to objects
        
        obj8 = null;
        obj7 = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        obj3 = null;
        
        System.out.println(obj1.name + " is " + obj1.age);
        System.out.println(obj2.name + " is " + obj2.age);
        
//        System.out.println(obj3.name + " is " + obj3.age);
//        System.out.println(obj4.name + " is " + obj4.age);
//        System.out.println(obj5.name + " is " + obj5.age);
//        System.out.println(obj6.name + " is " + obj6.age);
//        System.out.println(obj7.name + " is " + obj7.age);
//        System.out.println(obj8.name + " is " + obj8.age);

// error because of objects were deleted
        
    }

}
