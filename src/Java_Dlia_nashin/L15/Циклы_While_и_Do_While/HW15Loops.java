
package Java_Dlia_nashin.L15.Циклы_While_и_Do_While;
// переписать домашнее задание урока 14 так , чтобы OUTER и INNER циклы  представяли собой while loop, а Middle цикл представлял собой do while llop.
// Создать класс. В классе статичный метод, который будет выводить на экране время в формате час:минута:секунда в интервале 0 до 6 часов
// Если час больше единицы и минута кратна 10-ти, то метод нужно закончить. Если же (секунда умноженная на час) больше минуты,
// то пора переходить на другую минтуту. Продемонстрировать данный метод в действии.
public class HW15Loops {
    static void showTime() {
        int hour = 0;
        OUTER: while(hour < 6) {
            int min = -1; // если использовать 0, то после 1 часа начнется второй из-за цикла ду вайл
            MIDDLE: do {
               int sec = 0;
                min++;
                if ((hour > 1) && (min % 10 == 0)) {
                    break OUTER;
                }
          //      int sec =0;
                INNER: while(sec < 60) {
                    if ((sec * hour) > min) {
                        continue MIDDLE; 
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
            } while(min < 59);
            hour++;
        }
    }
    public static void main(String[] args) {
        showTime();
    }
}
