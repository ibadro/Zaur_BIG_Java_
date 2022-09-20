package Black_Belt.L02.Genenrics.Game;

public abstract class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return имя метода
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
