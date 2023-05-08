import java.util.*;

public class esercizio {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Cane persie = new Cane(60, 45, "corso");

        System.out.println("My dog is " + persie.getHeight() + "cm tall and weighs " + persie.getWeight() + "kg. Her breed is an half-breed with a " + persie.getBreed() + ".");

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Cane doggo =new Cane(30,40, "maltese");
        Fish hammerShark = new Fish(600, 85, "shark");
        Bird condor = new Bird (150, 15, 330);

        Map<String, Double> speedMeter = new HashMap<>();

        speedMeter.put(doggo.getClass().toString(), doggo.runSpeedMetersPerSecond());
        speedMeter.put(hammerShark.getClass().toString(), hammerShark.swimSpeedMetersPerSecond());
        speedMeter.put(condor.getClass().toString(), condor.flySpeedMetersPerSecond());

        String speedestAnimal = null;

        for (Map.Entry<String, Double> entry : speedMeter.entrySet()){
            if (entry.getValue() > entry.getValue());
            speedestAnimal= entry.getKey();
        }
            System.out.println(speedestAnimal);
        // Your code here
    }
}
