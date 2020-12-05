package learning.java.intermediate;

public class Lambdas {

    private String car;
    private boolean stick;
    private boolean automatic;

    public Lambdas(String carMaker, boolean manual, boolean cruiseControl) {
        this.car = carMaker;
        this.stick = manual;
        this.automatic = cruiseControl;
    }

    public boolean isStick(){return stick;}
    public boolean isAutomatic(){return automatic;}
    public String toString(){return car;}
}
@FunctionalInterface
interface CarType{
    public boolean test(Lambdas a);
}

class CarMatch{
    //static int f = 0;
    private static void printOut(Lambdas lambdasParam, CarType type){
        // how does this test all parameters without a for. is there one built in when dealing with a functional
        // interface? what am i missing?
        if(type.test(lambdasParam)){
            System.out.println(lambdasParam);
        }
    }
    public static void main(String[] mainParam){
        printOut(new Lambdas("Nissan", false, true), a -> a.isAutomatic());
        printOut(new Lambdas("Ford", true, false), Lambdas::isAutomatic);
    }
}