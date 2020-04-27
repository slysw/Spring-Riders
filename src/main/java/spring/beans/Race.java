package spring.beans;

import java.util.Set;

public class Race {

    private int numberOfRaceParticipants;

    private Set<Horse> raceParticipants;

    public Race(int numberOfRaceParticipants) {
        this.numberOfRaceParticipants = numberOfRaceParticipants;
    }

    public int getNumberOfRaceParticipants() {
        return numberOfRaceParticipants;
    }

    public void setNumberOfRaceParticipants(int numberOfRaceParticipants) {
        this.numberOfRaceParticipants = numberOfRaceParticipants;
    }

    public Set<Horse> getRaceParticipants() {
        return raceParticipants;
    }

    public void setRaceParticipants(Set<Horse> raceParticipants) {
        this.raceParticipants = raceParticipants;
    }

    public void showRaceInfo(Race race) {
        System.out.println("Information about upcoming race:");
        for (Horse participant : race.getRaceParticipants()) {
            System.out.println(participant.toString());
        }
        System.out.println("");
    }
}
