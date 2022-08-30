package Alishev.Рекурсия;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(fac(12));
    }
    private static int fac(int n) {
        if(n==1)
            return 1;
        return n*fac(n-1);
    }
}
//  находим факториал рекурсией