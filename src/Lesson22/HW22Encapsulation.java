
package Lesson22;

public class HW22Encapsulation {
    
    private StringBuilder name;
    private int course;
    private int grade;
    
    // let's create getters
    
    public StringBuilder getName(){
        
        StringBuilder copyOfName = new StringBuilder(name); // now i will work with copy
        return copyOfName;
    }
    
    public int getCourse(){
        return course;
    }
    
    public int getGrade(){
        return grade;
    }
    
    // let's create setters
    
    public void setName(StringBuilder setterName){
    
        if (setterName.length() >= 3) {
            name = setterName;
        } else {
            System.out.println("try again");
        }
        
    }
    
    public void setCourse(int setterCourse){
        if (setterCourse >= 1 && setterCourse <= 4) {
            course = setterCourse;
        } else {
            System.out.println("invalid value of course");
        }
    }
    
    public void setGrade(int setterGrade){
        if (setterGrade >= 1 && setterGrade <= 10) {
            grade = setterGrade;
        } else {
            System.out.println("invalid value of grade");
        }
    }
    
    // let's create showInfo()
    
    public void showInfo(){
    
        System.out.println("name: " + getName() + ", course: " + getCourse() + ", grade: " + getGrade());
    
    }
    
}

class TestStudent{

    public static void main(String[] args) {
        
        HW22Encapsulation student = new HW22Encapsulation();
        
        // let's set some value to student
        
        student.setName(new StringBuilder("Fedor"));
        System.out.println(student.getName());  // Fedor   
//        student.setCourse(6); // invalid value of course    
        student.setCourse(4);
        System.out.println(student.getCourse()); // 4   
//        student.setGrade(10.1); // invalid value of grade    
        student.setGrade(7);
        System.out.println(student.getGrade()); // 7.9
        
        student.showInfo(); // name: Fedor, course: 4, grade: 7.9

        
    }

}
