package Java_Dlia_nashin.L04.Класс_и_Обьект;

public class Student1 {
    int id;
    String name;
    String surname;
    int yaer;
    double srmath;
    double sreconom;
    double srinostr;
}
class StudentTest1{
    public static void main(String[] args) {

    Student1 st1 = new Student1();
    Student1 st2 = new Student1();
    Student1 st3 = new Student1();

    st1.srmath =3.2;
    st2.srmath =4.2;
    st3.srmath =3.0;

        st1.sreconom  =3.2;
        st2.sreconom  =4.2;
        st3.sreconom =5.0;

        st1.srinostr =3.2;
        st2.srinostr =4.0;
        st3.srinostr =2.0;
        System.out.println((st1.sreconom+st1.srmath+st1.sreconom)/3);
        System.out.println((st2.sreconom+st2.srmath+st2.sreconom)/3);
        System.out.println((st3.sreconom+st3.srmath+st3.sreconom)/3);
    }
}