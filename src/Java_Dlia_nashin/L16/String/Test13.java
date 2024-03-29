
package Java_Dlia_nashin.L16.String;

public class Test13 {
    
    public static void main(String[] args) {
        
        String x = "privet";
        String y = "privet".trim();
        
        System.out.println(x == y); // true
        // x помещает объект privet в стринг пул
        // y берет privet из стринг пула, а НЕ СОЗДАЕТ НОВЫЙ
        // трим ничего не меняет в объекте privet, и возвращает ЕГО ЖЕ
        // поэтому мы сравниваем ссылки на один и тот же объект
        // то есть x == у // true
        
        String x2 = "пока";
        String y2 = "   пока".trim();
        
        System.out.println(x2 == y2); // false
        
        // x2 помещает объект пока в стринг пул
        // y2 помещает объект "   пока" в стринг пул
        // trim делает из "   пока" -- пока
        // так как трим изменил объект, он создает и возвращает новый, присваивая его переменной y2
        // таким образом x2 ссылается на пока, а y2 ссылается на НОВЫЙ ОБЪЕКТ ПОКА
        // они имеют разные ссылки, то есть они не равны
        
    }
    
}
