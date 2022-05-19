
package Lesson19;

public class Test2 {
    
    // может быть всего один varargs в параметрах
    // в списке параметров varargs должен быть последним
    // по сути varargs - это массив
    static void summ(String s1, int ... a) { // varargs - это значит , что переменную типа инт можно вызвать любое кол-во раз
        // можно прокинуть и String и инт и вообще любой тип данных одновременно
        
        
        // когда мы используем varargs, java сама переводит этот varargs в массив
        // что позволит нам обращаться так a[i]
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }
        System.out.println(summ);
        
    }
    
//        static void summ(String s1, int [] a) { 
//        
//        System.out.println("*");
//        
//        }
    // это такой же метод , как и выше, int [] a - это тоже самое , что и int ... a
    
    public static void main(String[] args) {
        // public static void main(String ... args) - тоже самое, что и public static void main(String[] args)
        // потому что ... (вараргс) - [] массив
        
        summ("GGG", 1,2,3); // 6
        summ("ggg", new int[]{1,2,3}); // 6
        // это тоже самое 1,2,3 и new int[]{1,2,3}, потому что так или иначе int [] a - это тоже самое , что и int ... a
        
    }
    
    // summ(int ... a) - метод позволяющий иметь внутри параметров неограниченное кол-во параметров и суммировать их
    
}
