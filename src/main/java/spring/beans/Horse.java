package spring.beans;

public class Horse implements Comparable<Horse>{
    private String nickName;
    private double age;
    private Breed breed;
    private Rider rider;
    private boolean chosen;
    private boolean winner;
    private int distance;


    public Horse(String nickName, double age, Breed breed, Rider rider) {
        this.nickName = nickName;
        this.age = age;
        this.breed = breed;
        this.rider = rider;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void addDistance(int distancePerSecond) {
        this.distance = distance + distancePerSecond;
    }

    @Override
    public String toString() {
        return "Participant {" +
                "horse nickName is '" + nickName + "'" +
                ", horse age is " + age + " years, " +
                breed +
                rider +
                "}";
    }

    public int compareTo(Horse horseDistance) {
        int compareDistance = horseDistance.getDistance();
        return compareDistance - this.distance;
    }
}
