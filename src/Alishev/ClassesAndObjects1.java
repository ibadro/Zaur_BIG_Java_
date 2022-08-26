package Alishev;

import ОсновыJava.УправляющиеИнструкции.UseCast;

public class ClassesAndObjects1 {
    public static void main(String[] args) {
        Shelovek shel = new Shelovek();
        shel.setName(" Какое-то имя");
        shel.setAge(11);
        System.out.println(" выводим занчение в Main " + shel.getName());
        System.out.println(" выводим занчение в Main " + shel.getAge());
    }
}

class Shelovek {
    private String name;
    private int age;

    public void setName(String username) { // setter
        if (username.isEmpty()) {  // проверяем чтобы пользователь не ввел пусотре имя
            System.out.println(" ты ввел пустое имя");
        } else {
            name = username;
        }

    }

    public String getName() { // getter
        return name;
    }

    public void setAge(int userAge) { // setter
        if (userAge < 0) { // проверем чтобы было меньше 0
            System.out.println("Error");
        } else {
            age = userAge;
        }
    }

    public int getAge() { // getter
        return age;
    }
}

