package FarmLab;

import java.util.Scanner;

public class Chicken extends Animal implements IProduce {


    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println(getClass().getSimpleName() + " is eating a " + edibleObject.getName());
    }


    public void makeNoise(String noise) {
        System.out.println(getClass().getSimpleName() + " said " + noise);

    }


    public void yield(boolean hasBeenFertilized, EdibleObject edibleEgg) {

        if (hasBeenFertilized == false) {
            System.out.println(getClass().getSimpleName() + " yielded a " + edibleEgg.getName());
        } else {
            System.out.println(getClass().getSimpleName() + " did not yield anything");
        }


    }

}

