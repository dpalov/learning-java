package learning.java.intermediate;

public enum EnumLearn {
    CAT("Meow"), DOG("Bark");
    private String commonBehaviour;

    private EnumLearn(String commonBehaviour) {
        this.commonBehaviour = commonBehaviour;
        System.out.println(commonBehaviour);
    }

    public void printNoise(EnumLearn animalNoise) {
        if (animalNoise == EnumLearn.CAT) {
            System.out.println(1);//CAT );
        } else {
            System.out.println(2);//DOG);
        }
    }
            public static void main(String[] args){
                EnumLearn callsConstructor = EnumLearn.CAT;
                EnumLearn doesNotCallConstructor = EnumLearn.DOG;
                EnumLearn tempVar = doesNotCallConstructor;
                System.out.println("tempVar");
                doesNotCallConstructor.printNoise(DOG);
                System.out.println(callsConstructor);
            }

}

