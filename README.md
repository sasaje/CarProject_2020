# Car project 2020
## I have made elements for the self-driven car. 
- Car with a turnEngineOn with a specific key. 
- CarTest with tests to se the functionallity.  
- Aircondition (on/off when the car is on)
- CarLight (on/off when the car is on, also enum with LightTypes, turnSignalLights that blinks when on/off, normal light both front and back on/off).
- CarGear (which can change gear in relation to the currentSpeed).


### Programmeringsøvelse - Bil.java og BilTest.java
 Vi vil modellere en bil mhp. at kunne gøre den selvkørende på sigt. 

I skal udvikle 2 klasser, Car.java og CarTest.java, som hhv. repræsenterer en bil og tester en bil. 

Bil-klassen skal have fields, som kan repræsenter bilens SAMLEDE TILSTAND, f.eks. : 





Udlæsning af currentSpeed, currentRpm, maxRpm, currentGear, odometer

Pedals: accelerator, footBrake, clutch pedals, hvor meget er de presset ned?

Rattets position

Tænding, er den tændt eller slukket?

Håndbremse

Udstyr: lys for og bag, vinduesviskere for og  bag

Varme og aircon?

Sikkerhedsudstyr?

Andre ting?

Constructor skal sørge for at fremstille en stillestående, slukket bil med realistiske egenskaber. 





Eksempler på metoder, som i kan fremstille:

startEngine(String keyCode)

stopEngine()

accelerate(...)

break(...)

clutch(...)

changeGear(...)

turnOn(...)

turnOff(...)

airconOn()


Til sidst   Bilen bør testes fra starten af med en så detaljeret test som muligt. 
