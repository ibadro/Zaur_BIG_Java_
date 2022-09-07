package Ot_prostogo.z1.OOP;


public class Dog {
    private static int dogsCount;

    private int lapi;
    private int hvost;
    private String name;
    private String poroda;
    private String size;

    public Dog() {
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public int getLapi() {
        return lapi;
    }


    public int getHvost() {
        return hvost;
    }

    public void setHvost(int hvost) {
        this.hvost = hvost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setLapi(int lapi) {
        if (lapi == 4) {
            this.lapi = lapi;
        } else {
            this.lapi = 4;
            System.out.println(" не корретное число лап   " + lapi);

        }

    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("big")
                | size.equalsIgnoreCase("sredn")
                | size.equalsIgnoreCase("small")) {
            this.size = size;
        } else {
            System.out.println(" bla bla ");

        }
    }
}