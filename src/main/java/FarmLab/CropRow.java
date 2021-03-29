package FarmLab;

public class CropRow{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(Crop crop){
        System.out.println(getClass().getSimpleName() + " stores " + crop.getName());
    }

}
