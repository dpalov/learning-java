package learning.java.intermediate;

public class Polymorphism { }


class MuscleCar {
    public boolean gotTires() {
        return true;
    }
}


interface Limo {
    public boolean gotTV();
}

class Vehicle extends MuscleCar implements Limo {
    public int speed = 120;

    public boolean gotTV() {
        return false;
    }



    public static void main(String[] param) {
        Vehicle vehicle = new Vehicle();

        Limo limo = vehicle;
        System.out.println(limo.gotTV());
        //System.out.println(limo.speed);


        MuscleCar muscleCar = vehicle;
        System.out.println(muscleCar.gotTires());
        //System.out.println(muscleCar.speed);

        MuscleCar muscleCar1 = new Vehicle();
        System.out.println(muscleCar1.gotTires());
        //System.out.println(muscleCar1.speed);


        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.gotTires());
        System.out.println(vehicle1.speed);
        System.out.println(vehicle1.gotTV());

        // CASTING
        Vehicle vehicle2 = (Vehicle)muscleCar1;
        System.out.println(vehicle2.speed);
        // Below and above do the same job
        System.out.println(((Vehicle) muscleCar1).speed);

    }

}
