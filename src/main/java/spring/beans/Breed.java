package spring.beans;

public class Breed {

    private String breedName;

    public Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    @Override
    public String toString() {
        return "horse breed is '" + breedName + "'";
    }
}
