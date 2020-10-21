/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 19/10/2020
 *
 */

public class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("");
        System.out.println("******************* TEST TESTSUITE *******************");
        System.out.println("");
        System.out.println("Testsuiten kører.");

        System.out.println("");
        System.out.println("******************* TEST ENGINE *******************");
        System.out.println("");

        System.out.print("# Test 1 (bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.print("# Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();

        System.out.println("");
        System.out.println("******************* TEST AIRCONDITION ON *******************");
        System.out.println("");

        System.out.print("# Test 3 (Aircondition skal være slukket, fordi bilen er slukket): ");
        testStartAirconditionEngineOff();
        System.out.print("# Test 4 (Aircondition skal gå fra at være slukket til at tændes, fordi bilen er tændt): ");
        testStartAirconditionEngineOn();
        System.out.print("# Test 5 (Aircondition er allerede tændt og bilen er tændt): ");
        testStartAirconditionEngineOnAirconOn();

        System.out.println("");
        System.out.println("******************* TEST AIRCONDITION OFF *******************");
        System.out.println("");

        System.out.print("# Test 6 (Aircondition bliver slukket, mens bilen er tændt): ");
        testAirconditionOff();
        System.out.print("# Test 7 (Aircondition bliver slukket, fordi bilen slukkes): ");
        testAirconditionOffEngineOff();

        System.out.println("");
        System.out.println("******************* TEST CARLIGHTS *******************");
        System.out.println("");

        System.out.print("# Test 8 (Carlight default set when the car is on): ");
        testCarLightDefaultSettings();

        System.out.print("# Test 9 (Carlight off when the car is off): ");
        testCarLightsEngineOff();

        System.out.println("");
        System.out.println("******************* TEST TURNING SIGNALS *******************");
        System.out.println("");

        System.out.println("# Test 10 (turnSignalLeftOn - blinks when it is set to on - no result check comments): ");
        try {
            testTurnSignalLeftOn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("# Test 11 (turnSignalRightOn - blinks when it is set to on - no result check comments): ");
        try {
            testTurnSignalRightOn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("# Test 12 (turnSignalLeft off when set to false): ");
        testTurnSignalLeftOff();
        System.out.print("# Test 13 (turnSignalRight off when set to false): ");
        testTurnSignalRightOff();

    }

    //Test 1 : start engine with the correct key - expected to pass
    private static void testStartCarWithCorrectKey() {
        Car myCar = new Car();
        CarKey key = new CarKey("password1234");
        myCar.turnEngineOn(key);
    }

    //Test 1 : start engine with the incorrect key - expected to fail
    private static void testStartCarWithWrongKey() {
        Car myCar = new Car();
        CarKey key = new CarKey("hest");
        myCar.turnEngineOn(key);

    }

    //Test 3 : start the aircondition - expected to fail because the engine is not on
    private static void testStartAirconditionEngineOff(){
        Car myCar = new Car();
        myCar.engineOn = false;
        CarAircondition airconditionOn = new CarAircondition(true);
        myCar.turnAirconditionOn(airconditionOn.airconditionOn);
    }

    //Test 4 : start the aircondition - expected to pass because the engine is on
    public static void testStartAirconditionEngineOn(){
        Car myCar = new Car();
        myCar.turnCarOn(); // turns car on with the correct key
        CarAircondition airconditionOn = new CarAircondition(false);
        myCar.turnAirconditionOn(airconditionOn.airconditionOn);
    }

    //Test 5 : the aircondition is already started - expected to pass
    private static void testStartAirconditionEngineOnAirconOn(){
        Car myCar = new Car();
        myCar.turnCarOn(); // turns car on with the correct key
        CarAircondition airconditionOn = new CarAircondition(true);
        myCar.turnAirconditionOn(airconditionOn.airconditionOn);
    }

    //Test 6: The aircondition is on and is now set to off - expected to pass because the engine is on.
    private static void testAirconditionOff(){
        Car myCar = new Car();
        myCar.turnCarOn(); // turns car on with the correct key
        CarAircondition airconditionOn = new CarAircondition(true);
        myCar.turnAirconditionOff();
    }

    //Test 7: The aircondition is off - expected to pass because the engine is off.
    private static void testAirconditionOffEngineOff(){
        Car myCar = new Car();
        myCar.engineOn =false; // turns car off
        myCar.turnAirconditionOff();
    }

    // Test 8: Set the default settings for the CarLight
    // expected to have frontlight and backlight on
    // type = NAERLYS.
    // turn signals false

    private static void testCarLightDefaultSettings(){
        Car myCar = new Car();
        myCar.turnCarOn(); // turns car on with the correct key
        CarLight myLight = new CarLight();
        myLight.turnOnLight(); // set default settings for the carLight
    }

    // Test 9: CarLight off when car is off
    private static void testCarLightsEngineOff(){
        Car myCar = new Car();
        myCar.engineOn=false; // turns car off
        CarLight myLight = new CarLight();
        myLight.turnOnLight(); // set default settings for the carLight
    }

    // Test 10: turnSignalLeftOn - blinks when it is set to on
    private static void testTurnSignalLeftOn() throws InterruptedException {
        Car myCar = new Car();
        myCar.engineOn=true; // turns car off
        CarLight myLight = new CarLight();
        //remove comment bellow to test this case
        // myLight.turnSignalLeftOn(); // set default settings for the carLight
    }

    // Test 11: turnSignalRightOn - blinks when it is set to on
    private static void testTurnSignalRightOn() throws InterruptedException {
        Car myCar = new Car();
        myCar.engineOn=true; // turns car off
        CarLight myLight = new CarLight();
        //remove comment bellow to test this case
        // myLight.turnSignalRightOn(); // set default settings for the carLight
    }

    // Test 12: turnSignalRight false - expected to be false
    private static void testTurnSignalRightOff(){
        CarLight.turnSignalRightOff();
    }
    // Test 13: turnSignalLeft false - expected to be false
    private static void testTurnSignalLeftOff(){
        CarLight.turnSignalLeftOff();
    }

}