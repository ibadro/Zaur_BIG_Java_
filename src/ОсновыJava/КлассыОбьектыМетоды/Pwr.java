package ОсновыJava.КлассыОбьектыМетоды;
/*Ключевое слово t h i s
И в заключение рассмотрим ключевое слово t h i s . При вызове метода ему
автоматически передается ссылка на вызывающий объект, которая обозначается
ключевым словом th i s . Следовательно, ключевое слово t h i s обозначает именно
тот объект, по ссылке на который действует вызываемый метод. Поясним назначение
ключевого слова t h i s на примере программы, в которой создается класс
Pwr, предназначенный для вычисления целочисленной степени заданного числа.*/
public class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;
        this.val = 1;
        if(exp==0) return;
        for( ; exp>0; exp--) this.val = this.val * base;
    }
        double get_pwr() {
            return this.val;
        }
}
class DemoPwr {
                public static void main(String args[]) {
                    Pwr x = new Pwr(4.0, 2);
                    Pwr y = new Pwr(2.5, 1);
                    Pwr z = new Pwr(5.7, 0);
                    System.out.println(x.b + " в степени " + x.e +  " равно" + x.get_pwr());
                            System.out.println(y.b + " в степени " + y.e +  " равно " + y.get_pwr () );
                    System.out.println(z.b + " в степени *" + z.e +     " равно "+ z.get_pwr () ) ;
                }
}
