package Black_Belt.Enum1;

public class Test1 {
    void method(String dayOfWeek){
        System.out.println("today is" +dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method("Monday");
    }
}
