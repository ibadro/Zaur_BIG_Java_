package Alishev.Enum1;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягух");
    private String trancl;

    Animal(){

    }

    Animal(String trancl) {
        this.trancl = trancl;

    }
    public String getTrancl(){
        return trancl;
    }

}
