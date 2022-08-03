
package Java_Dlia_nashin.L14.Цикл_For_Break_Continue;
// Создать класс. В классе статичный метод, который будет выводить на экране время в формате час:минута:секунда в интервале 0 до 6 часов
// Если час больше единицы и минута кратна 10-ти, то метод нужно закончить. Если же (секунда умноженная на час) больше минуты,
// то пора переходить на другую минуту. Продемонстрировать данный метод в действии.
public class HW14oClock {
    static void showTime() {
        OUTER: for (int hour = 0; hour <= 6; hour++) {
            MIDDLE: for (int min = 0; min <= 59; min++) {
                if ((hour > 1) && (min % 10 == 0)) {
                    break OUTER;   
                }
                INNER: for (int sec = 0; sec <= 59; sec++) {
                    if ((sec * hour) > min) {
                        continue MIDDLE; 
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }
    public static void main(String[] args) {
        showTime();
    }
}
