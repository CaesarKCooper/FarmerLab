package FarmLab;

import java.util.ArrayList;

public class Farm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void store(Stable stable, ChickenCoop chickenCoop, FarmHouse farmHouse){

    System.out.println(getClass().getSimpleName() + " stores " + stable.getName() + ", " + chickenCoop.getName() + ", " + farmHouse.getName());
}



}
