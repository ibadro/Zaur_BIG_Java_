package Alishev;

public class Static1 {
    public static void main(String[] args) {

        Human5 h5 = new Human5("ror", 34);
        Human5 h6= new Human5("hr", 66);
        Human5.primer = "nice";
        h5.getAllFields();
        h6.getAllFields();
        Human5.primer = "bad";
        h5.getAllFields();
        h6.getAllFields();


    }
}

    class Human5 {
        private String name;
        private int age;

        public static String primer;


        public Human5(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void getAllFields() {
            System.out.println(name + ", " + age + "   ,"+ primer);

        }
    }
