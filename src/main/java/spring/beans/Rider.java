package spring.beans;

public class Rider {

    private String riderName;

    private double riderWeight;

    public Rider(String riderName, double riderWeight) {
        this.riderName = riderName;
        this.riderWeight = riderWeight;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public double getRiderWeight() {
        return riderWeight;
    }

    public void setRiderWeight(double riderWeight) {
        this.riderWeight = riderWeight;
    }

    @Override
    public String toString() {
        return  ", rider name is '" + riderName + "'" +
                ", rider weight is " + riderWeight + " kg.";
    }
}
