
package Java_Dlia_nashin.L02.Примитивные_данные;

public class HW2 {
    public static void main (String [] args) {
        
        byte b1 = 12;
        byte b2 = 0b1100; // 0b1100 нужное число - двоичная
        byte b3 = 014; // 014 нужно число - восьмиричная
        byte b4 = 0xC; // 0xС нужное число - шестнадцатиричная
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        short s1 = 1300;
        short s2 = 0b10100010100;
        short s3 = 02424;
        short s4 = 0x514;
        
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
        System.out.println(s4);
        
        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;
                
        System.out.print(i1);
        System.out.print(i2);
        System.out.print(i3);
        System.out.println(i4); // 0 во всех системах равен 0

        long l1 = 123456789L;
        long l2 = 0b111010110111100110100010101L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        float f1 = 2.14F;
        float f2 = 2.14f;
        
        System.out.println(f1);
        System.out.println(f2);
        
        double d1 = 3.14D;
        double d2 = 3.14d;
        double d3 = 3.14;
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        System.out.println(bool1);
        System.out.println(bool2);
        
        char c1 = 'd';
        char c2 = '\u0064';
        char c3 = 100;
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
    }
}
