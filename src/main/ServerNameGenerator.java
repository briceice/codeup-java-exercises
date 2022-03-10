package main;


public class ServerNameGenerator {
    public static String[] nouns = {"Table", "Chair", "Dog", "Cat", "Tree", "Car", "Cloud", "Bird", "Sun", "Lake"};
    public static String [] adjectives = {"Fancy", "Angry", "Smelly", "Bright", "Joyous", "Hungry", "Sleepy",
            "Upbeat", "Timid", "Adamant"};

    public static String chooseRandomElement(String[] array){
        int num = (int) (Math.random()*10);
        return array[num];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name: %s-%s", chooseRandomElement(adjectives),
                chooseRandomElement(nouns) );
    }
}
