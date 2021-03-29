package FarmLab;

public class ChickenCoop {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(Chicken chicken){
        System.out.println(getClass().getSimpleName() + " stores " + chicken.getName());
    }

}
