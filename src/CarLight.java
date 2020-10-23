/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 20/10/2020
 *
 */

public class CarLight {

    public boolean carlightFrontOn;
    public boolean carlightBackOn;
    //  public String type;

    //turn signals
    public boolean rightTurnSignal; //right turn signal - both back and front
    public boolean leftTurnSignal; //left turn signal - both back and front

    CarLight(boolean carlightFrontOn, boolean carlightBackOn) {
        this.carlightFrontOn = carlightFrontOn;
        this.carlightBackOn = carlightBackOn;
    }
    // default settings on all new objects for the CarLight
    CarLight(){
        carlightFrontOn = true;
        carlightBackOn = true;
        leftTurnSignal = false;
        rightTurnSignal = false;
    }

    public void turnOnLight(){
        if(Car.engineOn==true){
            CarLight myCar = new CarLight();
            LightType myLightType = LightType.NAERLYS;
            System.out.println("Carlight type: " + myLightType);
            System.out.println("Carlight: front(" + myCar.carlightFrontOn + ") and back(" + myCar.carlightBackOn + ")");
            System.out.println("Right and left turn signal is: right(" + myCar.rightTurnSignal + "), left(" + myCar.leftTurnSignal + ")");
        }else{
            System.out.println("The lights are turned off because the car is off.");
        }
    }

    public static void turnSignalLeftOn() throws InterruptedException {
        if(Car.engineOn==true){
            CarLight myCar = new CarLight();
            //for every blink turn off and on
            myCar.leftTurnSignal = true;

            while(myCar.leftTurnSignal == true){
                myCar.leftTurnSignal = false;
                System.out.println("false");
                //delay
                Thread.sleep(1000); // do nothing for 1000 miliseconds (1 second)
                myCar.leftTurnSignal = true;
                System.out.println("true");
            }
        }else{
            System.out.println("All lights are turned off because the car is off.");
        }
    }

    public static void turnSignalLeftOff(){
        CarLight myCarLight = new CarLight();
        myCarLight.leftTurnSignal = false;
        System.out.println("The leftTurnSignal is now off.");
    }

    public static void turnSignalRightOn() throws InterruptedException {
        if(Car.engineOn==true){
            CarLight myCar = new CarLight();
            //for every blink turn of and on
            myCar.rightTurnSignal = true;

            while(myCar.rightTurnSignal == true){
                myCar.rightTurnSignal = false;
                System.out.println("false");
                //delay
                Thread.sleep(1000); // do nothing for 1000 miliseconds (1 second)
                myCar.rightTurnSignal = true;
                System.out.println("true");
            }
        }else{
            System.out.println("All lights are turned off because the car is off.");
        }
    }

    public static void turnSignalRightOff(){
        CarLight myCarLight = new CarLight();
        myCarLight.rightTurnSignal = false;
        System.out.println("The rightTurnSignal is now off.");
    }
}
