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
    public String type;

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
        type = "naerlys"; // other options (naerlys, fjernlys, parkingslys)
        leftTurnSignal = false;
        rightTurnSignal = false;
    }


    public static void turnOnLight(){
        CarLight myCar = new CarLight();
//        System.out.println(myCar.leftTurnSignal);
        System.out.println("Carlight type: " + myCar.type + " is on.");
        System.out.println("Carlight: front(" + myCar.carlightFrontOn + ") and back(" + myCar.carlightBackOn + ")");
        System.out.println("Right and left turn signal is: right(" + myCar.rightTurnSignal + "), left(" + myCar.leftTurnSignal + ")");
    }
}
