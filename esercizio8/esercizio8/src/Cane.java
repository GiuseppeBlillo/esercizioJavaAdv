public class Cane extends Animale{
    String breed;
    public Cane(double height, double weight) {
        super(height, weight);
    }

    public Cane(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond(){
        return getHeight()*2;
    }
}
