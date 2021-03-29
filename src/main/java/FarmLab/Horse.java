package FarmLab;

public class Horse extends Animal implements IRideable {


    public void eat(EdibleObject edibleObject) {
        System.out.println(getClass().getSimpleName() + " is eating a " + edibleObject.getName());
    }

    public void makeNoise(String noise) {

        System.out.println("Horse said " + noise);
    }


    public void ride(Farmer farmer) {
        System.out.println(farmer.getName() + " is riding the " + getClass().getSimpleName());

    }

}
