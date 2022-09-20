package Black_Belt.Lamda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        final int i = 10;
        def((String s) -> {return s.length();});
        def((String s) -> {return s.length() + i;});
        def((String s) -> {return i;});
        //def(() -> 15);
    }
}
interface I{
    int abc(String s);
}
