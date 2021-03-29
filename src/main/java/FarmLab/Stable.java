package FarmLab;

public class Stable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(RideableObject horse){
        System.out.println(getClass().getSimpleName() + " stores " + horse.getName());
    }




}
