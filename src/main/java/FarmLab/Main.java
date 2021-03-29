package FarmLab;

public class Main {

    public static void main(String[] args) {

        EdibleObject edibleEgg = new EdibleObject();
        edibleEgg.setName("edibleEgg");

        Person person = new Person();
        person.setName("person");

        Chicken chicken = new Chicken();
        chicken.setName("chicken");

        EdibleObject tomato = new EdibleObject();
        tomato.setName("tomato");
        EdibleObject earCorn = new EdibleObject();
        earCorn.setName("earCorn");

        Crop corn = new Crop();
        corn.setName("corn");
        Crop tomatos = new Crop();
        tomatos.setName("tomato");
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();


        CropRow cropRow = new CropRow();
        cropRow.setName("cropRow");

        Farmer farmer = new Farmer();
        farmer.setName("farmer");


        RideableObject horse = new RideableObject();
        horse.setName("horse");

        Field field = new Field();

        Farm farm = new Farm();
        farm.setName("farm");
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.setName("chickenCoop");
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.setName("farmHouse");
        Stable stable = new Stable();
        stable.setName("stable");

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //horse making noise
        horse.makeNoise("neigh, neigh");

        //horse eating
        horse.eat(earCorn);

        //horse is rideable
        horse.ride(farmer);

        //chicken making noise
        chicken.makeNoise("cah, cah");

        //chicken eating
        chicken.eat(tomato);

        //chicken yielding egg
        chicken.yield(false, edibleEgg);

        //rider mounting and dismounting
        farmer.mount(horse);
        farmer.dismount(horse);

        //botanist planting crop in croprow
        farmer.plantCrop(corn,cropRow);

        //crop row stores crop
        cropRow.store(corn);

        //field stores croprow
        field.store(cropRow);

        //tractor operating on a farm
        tractor.operate(farm);

        //tractor harvesting crop
        tractor.harvest(corn);

        //cropduster operating on a farm
        cropDuster.operate(farm);

        //cropduster flying
        cropDuster.fly(farmer);

        //cropduster fertilizing croprow
        cropDuster.fertilize(cropRow);

        //cornstalk yielding earcorn
        cornStalk.yield(false,true, earCorn);

        //tomato plant yielding tomato
        tomatoPlant.yield(false,true,tomato);

        //farmer is a eater,rider,botanist,person
        farmer.eat(earCorn);
        farmer.mount(horse);
        farmer.dismount(horse);
        farmer.plantCrop(corn,cropRow);
        farmer.makeNoise("hello");

        //stable storing horses
        stable.store(horse);

        //farmhouse storing person
        farmHouse.store(person);

        //chickencoop storing chicken
        chickenCoop.store(chicken);

        //farm stores stable, chickencoop, farmhouse
        farm.store(stable,chickenCoop,farmHouse);




















    }

}
