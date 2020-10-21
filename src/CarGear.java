/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 20/10/2020
 *
 */

public class CarGear {

    public static void main(String[] args) {

        int currentSpeed = 0;
        // neutral gear is the default gear when the car is off.
        Gear myGear;

        // change gear when currentSpeed is
        // gear neutral = 0km/h
        // gear 1 == 0< km/h
        // gear 2 == <10km/h
        // gear 3 == <25km/h
        // gear 4 == <40km/h
        // gear 5 == <50km/h
        // gear R == 0km/h - reverse gear TODO
        if(Car.engineOn == true) {
            if(currentSpeed==0){
                myGear = Gear.GEARNEUTRAL;
                System.out.println(myGear);
            }else if(currentSpeed > 0 && currentSpeed < 10){
                myGear = Gear.GEAR1;
                System.out.println(myGear);
            }else if(currentSpeed >= 10 && currentSpeed < 25){
                myGear = Gear.GEAR2;
                System.out.println(myGear);
            }else if(currentSpeed >= 25 && currentSpeed < 40){
                myGear = Gear.GEAR3;
                System.out.println(myGear);
            }else if(currentSpeed >= 40 && currentSpeed < 50){
                myGear = Gear.GEAR4;
                System.out.println(myGear);
            }else if(currentSpeed >= 50){
                myGear = Gear.GEAR5;
                System.out.println(myGear);
            }
        }else{
            System.out.println("Sorry the car is not on, please turn on the car to change gears");
        }
    }
}
