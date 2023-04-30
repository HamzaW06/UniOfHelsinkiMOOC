import java.util.*;

class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void observe() {
        observations++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}

class Database {
    private Map<String, Bird> birds;

    public Database() {
        birds = new HashMap<>();
    }

    public void addBird(String name, String latinName) {
        birds.put(name, new Bird(name, latinName));
    }

    public void observeBird(String name) {
        Bird bird = birds.get(name);
        if (bird != null) {
            bird.observe();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printAllBirds() {
        for (Bird bird : birds.values()) {
            System.out.println(bird);
        }
    }

    public void printOneBird(String name) {
        Bird bird = birds.get(name);
        if (bird != null) {
            System.out.println(bird);
        } else {
            System.out.println("Not a bird!");
        }
    }
}