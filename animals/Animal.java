package HML_projects.animals;

public class Animal {
    void walkDescription() {
        System.out.println("May or may not have legs");

    }
    void soundDescription() {
        System.out.println("Animal sounds");
    }
    void isDomestic() {
        System.out.println("Can be Domestic or not");
    }

}
class Dog extends Animal {
    Dog(){
        System.out.println( "I am a dog");
    }
    void walkDescription() {
        System.out.println("Has legs");
    }
    void soundDescription() {
        System.out.println("Bark");
    }
    void isDomestic() {
        System.out.println("Is Domestic");
    }
}

class Lion extends Animal {
    Lion(){
        System.out.println( "I am a lion");
    }
    void walkDescription() {
        System.out.println("Has legs");
    }

    void soundDescription() {
        System.out.println("Roar");
    }
    void isDomestic() {
        System.out.println("Lol");
    }
}
class Snake extends Animal {
    Snake(){
        System.out.println("I am a snake");
    }
    void walkDescription() {
        System.out.println("Slithers");
    }
    void soundDescription() {
        System.out.println("Hiss");
    }
    void isDomestic() {
        System.out.println("Domesticate me I dare you");
    }
}
