package main;


public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] nouns = {"Table", "Chair", "Dog", "Cat", "Tree", "Car", "Cloud", "Bird", "Sun", "Lake"};
        String [] adjectives = {"Fancy", "Angry", "Smelly", "Bright", "Joyous", "Hungry", "Sleepy",
                "Upbeat", "Timid", "Adamant"};

        System.out.printf("Here is your server name: %s-%s", chooseRandomElement(adjectives),
                chooseRandomElement(nouns) );
    }
    public static String chooseRandomElement(String[] array){
        int num = (int) (Math.random()* array.length);
        return array[num];
    }
}
