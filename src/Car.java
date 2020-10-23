/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 19/10/2020
 *
 */

/*
Vi vil modellere en bil mhp. at kunne gøre den selvkørende på sigt.

I skal udvikle 2 klasser, Bil.java og BilTest.java, som hhv. repræsenterer en bil og tester en bil.

Bil-klassen skal have fields, som kan repræsenter bilens SAMLEDE TILSTAND, f.eks. :
    Udlæsning af currentSpeed, currentRpm, maxRpm, currentGear, odometer
    Pedals: accelerator, footBrake, clutch pedals, hvor meget er de presset ned?
    Rettens position
    Tænding, er den tændt eller slukket?
    Håndbremse
    Udstyr: lys for og bag,  vinduesviskere for og  bag
    Varme og aircon?
    Sikkerhedsudstyr?
    Andre ting?
Constructor skal sørge for at fremstille en stillestående, slukket bil med realistiske egenskaber.
Eksempler på metoder, som i kan fremstille:
    start(String keyCode)
    stop()
    accelerate(...)
    break()
    clutch()
    changeGear(...)
    turnOn(...)
    turnOff(...)
Til sidst skal bilen testes med en så detaljeret test som muligt.
 */

public class Car {

    private String password;
    public static boolean engineOn = false;
    public boolean airconditionOn = false;
    public CarLight light = new CarLight(); // set all new cars to have light on

    Car() {
        this.password = "password1234";
        this.engineOn = false;
        this.airconditionOn = false;
        CarColor.myCarColor = Color.SILVER;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("The car is turned on.");
            engineOn = true;
        } else {
            System.out.println("The car can't turn on because of an incorrect key.");
        }
    }

    public void turnCarOn(){
        CarKey key = new CarKey("password1234");
        turnEngineOn(key);
//        CarLight.turnOnLight(); // set default settings for the carLight
    }

    //TODO move to CarAircondition

    public void turnAirconditionOn(boolean airconditionOn){
        if(engineOn == true) {
            if (airconditionOn == true) {
                System.out.println("Aircondition is already on.");
            }else if (airconditionOn == false) {
                airconditionOn = true;
                System.out.println("Aircondition is now turned on.");
            }
        }else{
            System.out.println("Aircondition can't start because the engine is not on");
        }
    }

    //TODO move to CarAircondition
    public void turnAirconditionOff(){
        if(engineOn==true){
            airconditionOn = false;
            System.out.println("Aircondition is now turned off.");
        }else{
            System.out.println("Aircondition is already off because the car is off.");
        }
    }
}

