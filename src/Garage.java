/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 21/10/2020
 *
 */

public class Garage {

    static Car[] allCars = new Car[100]; // Et Array - Der kan være 100 biler (objekter) i garagen og antallet kan ikke
    // lige justeres efterfølgende.

    int[] randomTal = new int[100]; // arrayList afgrænset, men du kan ændre antal objekter i løbende
    int[] numbers = {8,7,13}; // arrayList afgrænset, men du kan ændre antal objekter i løbende
    static Object[] objects = new Object[10];

    public static void main(String[] args) {
        allCars[0] = new Car(); // fra nu kan bilen bruges
        allCars[0].turnAirconditionOff();
//        allCars[0].turnEngineOn(); need a carKey to work

        for (int i = 0; i < 100; i++) {
            allCars[i] = new Car(); // laver alle biler i garagen.
        }

        // Objekt array
        objects[0] = new Car();
        objects[1] = new Garage();
        System.out.println("The Garage contains " + objects.length + " elements");


    }
}
