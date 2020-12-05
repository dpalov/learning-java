package learning.java.intermediate;

public class Overriding {

    private int userID;
    private char sex;
    private String name;

    public Overriding(int userID, char sex, String name){
        this.userID = userID;
        this.sex = sex;
        this.name = name;
    }

    // Overriding the equals() method
    @Override
    public boolean equals(Object isEqual){
        if (!(isEqual instanceof Overriding)) {
            return false;
        }

        Overriding OverridingToCompare = (Overriding) isEqual;
        return this.userID == OverridingToCompare.userID && this.sex == OverridingToCompare.sex
                && this.name == OverridingToCompare.name;


      // could use EqualsBuilder from Apache Commons

    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    public static void main(String[] args){

        Overriding test1 = new Overriding(2, 'm', "name1");
        Overriding test2 = new Overriding(2, 'm', "name2");
        boolean result = test1.equals(test2);
        System.out.println(result);

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

    }


}
