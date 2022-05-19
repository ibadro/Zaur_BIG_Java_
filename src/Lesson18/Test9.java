
package Lesson18;

public class Test9 {
    
    // метод для вывода максимального и минимального значений в массиве
    public static void maxMin(double[] array) {
        
        double max = array[0];
        double min = array[0];
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > max) {
                max = array[i];
            } // если array[i] больше max (изначально он равен первому элементу массива)
              // то присваиваем максу значение array[i]
            
            if (array[i] < min) {
                min = array[i];
            } // если array[i] меньше min (изначально он равен первому элементу массива)
              // то присваиваем мину значение array[i]
            
        }
        
        System.out.println("min of arr:" + min + ", max of arr:" + max);
        
    }
    
    public static void main(String[] args) {
        
        double arr [] = {1.3, -5.4, 23, -1.2, 0, 99.9};
        maxMin(arr); // min of arr:-5.4, max of arr:99.9
        
        maxMin(new double [] {1.3, -5.4, 23, -1.2, 0, 99.9});
        // min of arr:-5.4, max of arr:99.9
        
    }
    
}
