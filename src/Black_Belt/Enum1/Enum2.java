package Black_Belt.Enum1;


import java.util.Arrays;

public class Enum2 {
    public static void main(String[] args) {
        Today1 today1 = new Today1(WeekDays1.Понидельник);
        today1.daysInfo();
        WeekDays1 w = WeekDays1.Среда;
        System.out.println(today1.weekDays);
WeekDays w15 =WeekDays.valueOf("Понидельник");//
        System.out.println(w15);

        WeekDays1[] array = WeekDays1.values(); //peredali vse znachenia v massiv
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays1 { // приват, конструктор работает сам
    Понидельник("bad"),
    Вторник("bad"),
    Среда("so-so"),
    Четверг("good"),
    Пятница("good"),
    Суббота("good"),
    Воскресение("good");
    private String mood;

    WeekDays1(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today1 {
    WeekDays1 weekDays;

    public Today1(WeekDays1 weekDays) {
        this.weekDays = weekDays;

    }

    void daysInfo() {
        switch (weekDays) {
            case Понидельник:
            case Вторник:
            case Среда:
            case Четверг:
            case Пятница:
                System.out.println("idi na rabotu");
                break;
            case Суббота:
            case Воскресение:
                System.out.println("vihodnoy");
                break;
        }
        System.out.println("nastroenie " + weekDays.getMood());
    }


}