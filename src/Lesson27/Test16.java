
package Lesson27;

import java.io.*;

public class Test16 {
    
}

class Animal2{
    Animal2() throws FileNotFoundException{}
}

class Mouse2 extends Animal2{ // в ребенке конструктора тоже нужно указывать эксепшен
    Mouse2()throws FileNotFoundException{
        super();
    }
}