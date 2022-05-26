package ОсновыJava.Массивы;
// Поиск минимального и максимального значений в массиве
public class MinMax {
    public static void main(String args[]) {
        int nums[] = new int[10];
        int min, max;
        nums[0]=99 ;
        nums[1]=-10;
        nums[2]=994;
        nums[3]=123;
        nums[4]=-99;
        nums[5]=92349;
        nums[6]=99;
        nums[7]=99234;
        nums[8]=949;
        nums[9]=9;
        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
}
        System.out.println("min и max: " + min + " " +max);
        }
    }

