package FarmLab;

public class Field extends Farm {


    public void store(CropRow cropRow) {
        System.out.println(getClass().getSimpleName() + " stores " + cropRow.getName());
    }
}
