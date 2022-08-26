package Alishev;

public class This1 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(13);
        human.setName("ivan");
        human.getInfo();

    }
}

class Human {
  private   String name;
  private   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //        public void setName(String name){  //  ALT + Insert -> set & get
//            this.name = name;
//        }
//        public  void setAge(int age){
//           this.age= age;
//        }
//        public String getName(){
//            return name;
//        }
//        public int getAge(){
//            return age;
//        }
    public void getInfo() {
        System.out.println(name + "," + age);
    }
}

