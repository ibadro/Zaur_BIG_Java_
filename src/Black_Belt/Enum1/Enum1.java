package Black_Belt.Enum1;

public class Enum1 {
    public static void main(String[] args) {
        Today1 today1 = new Today1(WeekDays1.Понидельник);
        today1.daysInfo();
    }
}

enum WeekDays {
    Понидельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресение;
}

class Today {
    WeekDays1 weekDays;

    public Today(WeekDays1 weekDays) {
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
    }


}
