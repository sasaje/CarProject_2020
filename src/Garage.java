/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 21/10/2020
 *
 */
public class Garage {

    static Car[] allCars = new Car[1000000];
    int[] randomTal = new int[100];
    int[] godeTal = {8, 7, 13};

    static Object[] objekter = new Object[10];
    int x = 5;
    Integer y = 8;

    public static void main(String[] args) {

        Car car1 = new Car();
        CarKey key = new CarKey("password1234");
        car1.turnEngineOn(key);
        Car car2 = new Car();
        car1.turnEngineOn(key);
        Car car3 = new Car();
        car1.turnEngineOn(key);
        Car car4 = new Car();
        car1.turnEngineOn(key);
        Car car5 = new Car();
        car1.turnEngineOn(key);
        Car car6 = new Car();
        car1.turnEngineOn(key);
        Car car7 = new Car();
        car1.turnEngineOn(key);
        Car car8 = new Car();
        car1.turnEngineOn(key);
        Car car9 = new Car();

        // Vælg en klasse du selv har lavet
        // Lav et array med 1000000 elementer
        // Udskriv deres unikke ID (toString())
        // Kald en selvvalgt metode på klassen på hvert objekt

/*        Car[] cars = new Car[1000000]; //skaber array med 1000000 biler
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.print(i + ". ");
            System.out.println(cars[i].toString());
            CarKey key2 = new CarKey("password1234");
            cars[i].turnEngineOn(key2);
            cars[i].turnAirconditionOn(true);
        }
        allCars[0] =  new Car();
        allCars[0].turnAirconditionOn(true);

        for (int i = 0; i < 1000000; i++) {
            allCars[i] = new Car();
        }

        objekter[0] = new Car();
        objekter[1] = new Garage();
        System.out.println("Garagen indeholder så mange elementer: " + allCars.length);
*/
        // **************Assignment above**************** //
        Car[] myCars = new Car[5]; // creates room to five new cars in the memory
        for (int i = 0; i < myCars.length; i++) { // five new cars in the array
            myCars[i] = new Car();
            CarKey myCarKey = new CarKey("password1234");
            myCars[i].turnEngineOn(myCarKey);
            myCars[i].light.turnOnLight(); // set the lights to on on all objects of the type Car.
            System.out.println("Elements uniq ID: " + myCars[i].toString() + " are created.");
        }
    }
}