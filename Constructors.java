package learning.java.basics;

public class Constructors {
    //defining but not initializing your instance variables
    public int num1;
    public int num2;
    public String string1;

    // Constructors are special methods with the same name as class in which they are defined. Constructors have no
    // return type at all. when creating an instance of a class by using the new keyword it is the constructor that
    // that creates and returns an object of that class. constructors can take parameters.  A simple example of a
    // constructor is below.

    public Constructors(int num1,int num2,String string1) {
        // A good use for the constructor is to initialize variables as follows.
        // parameter names can be any name including the same name of the instance variables we are about to initialize.
        // using the this keyword we can differentiate between the constructors parameters and the instance variables
        // we are about to initialize.
        this.num1 = num1;
        this.num2 = num2;
        this.string1 = string1;

        System.out.println("The constructor just produced an instance of this class");
    }
    // if you do not create a constructor java will create one for you that takes no parameters and has an empty body.
    // this is called a default constructor. So you don't have to worry about creating constructor if you have no need
    // to do so.

    // one last thing to note is that if you use the private access modifier when creating the constructor then the
    // constructor does not allow other classes to instantiate the class. The class can only be instantiated from calls
    // within the class itself.

    // constructor overloading. You can have as many constructors within the class as you want as long as you keep the
    // same name (which you have to anyway when creating a constructor) and must have different parameters. Jave knows
    // which constructor to call bases on the parameter entered. In this case either a String or an int. See below.

    public Constructors(String yourNameParam){
        System.out.println("Hello " + yourNameParam);
    }
    public Constructors(int ageParam){
        System.out.println("you are " + ageParam + " years old");
    }

    // There is a way to call multiple constructors of the same class. this is done by using the this keyword but used
    // as a method this(). this() must be the first non commented statement used in the constructor. in the constructor
    // below we call the constructor from above that takes a String parameter using the this() keyword.
    public Constructors(){
        this("Harry");
    }

    public static void main(String[] mainStringArrayParam){
        // below will call the constructor that takes a String and passing it the name Harry.
        Constructors newConstructorsVar = new Constructors();
        //ConstructorsSuper callingSuper = new ConstructorsSuper();

        // below will call the constructor that takes an int and prints out your age.
        // Constructors newConstructorsVar = new Constructors(27);
    }

}
// below we make another class to show how the super() keyword is used. it's just like the this() keyword except it
// calls a constructor of it's parent class. super() must be the first statement in the constructors body the same as
// this().

class ConstructorsSuper extends Constructors {
    public ConstructorsSuper(){
        super("Elfs");
    }
    public static void main(String[] StringVal) {
        ConstructorsSuper callingSuper = new ConstructorsSuper();
    }
}