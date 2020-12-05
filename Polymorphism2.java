package learning.java.intermediate;

public class Polymorphism2 {
}
interface Laundry{
    void socks();
}

class SaturdayWash implements Laundry{
    public void socks(){
        System.out.println("Brown");
    }
}

class SundayWash implements Laundry{
    public void socks(){
        System.out.println("White");
    }
}

class SockColors{
    public void whatColors(Laundry washedSockColors){
        washedSockColors.socks();
    }
    public static void main(String[] param){
        SockColors SC = new SockColors();
        SC.whatColors(new SaturdayWash());
        SC.whatColors(new SundayWash());
    }
}

