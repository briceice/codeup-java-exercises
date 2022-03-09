package main;

public class Dog {
    private String name;
    private final String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println(this.name + ": bark bark!");
    }


    public static void main(String[] args) {
        Dog march = new Dog("March", "Jack Russel Terrier", 9);
        march.bark();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
