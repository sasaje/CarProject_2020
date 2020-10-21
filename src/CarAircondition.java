/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 19/10/2020
 *
 */

public class CarAircondition {

    enum airconditionLevels {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3
    }

    public boolean airconditionOn;

    CarAircondition(boolean airconditionOn) {
        this.airconditionOn = airconditionOn;
    }

    // Method to change the level of the aircondition based on the currentTemp
    public static void CarAirconditionChangeTemp() {
        double currentTemp = 0;
        airconditionLevels myTemp = airconditionLevels.LEVEL0;

        // if currentTemp is less than 0 set airconditionLevels to LEVEL3
        // if currentTemp is less than 15 set airconditionLevels to LEVEL2
        // if currentTemp is less than 20 set airconditionLevels to LEVEL1
        // if currentTemp is less than 25 set airconditionLevels to LEVEL0
        if(Car.engineOn == true) {
            if (currentTemp <= 0){
                myTemp = airconditionLevels.LEVEL3;
                System.out.println(myTemp);
            } else if (currentTemp < 10 && currentTemp > 20) {
                myTemp = airconditionLevels.LEVEL2;
                System.out.println(myTemp);
            } else if (currentTemp <= 20 && currentTemp > 25) {
                myTemp = airconditionLevels.LEVEL1;
                System.out.println(myTemp);
            } else if (currentTemp >= 25) {
                myTemp = airconditionLevels.LEVEL0;
                System.out.println(myTemp);
            }
        } else {
            System.out.println("Sorry can't turn on the Aircondition because the car is not on.");
        }
    }
}

