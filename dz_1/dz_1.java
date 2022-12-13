package dz_1;

import java.util.ArrayList;
import java.util.List;

/**
 * dz_1
 */
public class dz_1 {

    public static void main(String[] args) {

       // Zoo zoo1 = new Zoo();
        //System.out.println(zoo1);

        List<Animal> animalList1 = new ArrayList<>();

        animalList1.add(new Geraffe("Tom"));
        animalList1.add(new Tiger("Timur"));
        animalList1.add(new Elephant("Slonik"));
        animalList1.add(new Geraffe());

        Zoo zoo2 = new Zoo(animalList1);
        System.out.println(zoo2);
        System.out.println(zoo2.findByName("Tom"));

        for (Animal i : animalList1) {
            i.voice();

        }

    }
}