package spring.services.impl;

import spring.beans.Horse;
import spring.beans.Race;
import spring.services.EmulationService;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EmulationServiceImpl implements EmulationService {

    private static final int MIN_DISTANCE_PER_SECOND = 5;
    private static final int MAX_DISTANCE_PER_SECOND = 20;
    private static final int RACE_LENGTH = 300;

    public void start(Race race) {
        race.showRaceInfo(race);
//        makeBet(race);
        go(race);
    }

    private void makeBet(Race race) {
        Scanner scanner = new Scanner(System.in);
        chose: while (true) {
            System.out.println("Make a bet (you can choose horse`s name or breed, or rider`s name):");
            String input = scanner.nextLine();
            for (Horse participant : race.getRaceParticipants()) {
                if (participant.toString().contains(input)) {
                    participant.setChosen(true);
                    System.out.println("Your choice: " + participant);
                    break chose;
                }
            }
        }
    }

    private void go(Race race) {
        System.out.println("The race STARTED!!!");
        try {
            int i = 0;
            stop: while (true) {
                Thread.sleep(2000);
                switch (i) {
                    case 0: {
                        System.out.println(++i + "-st second:");
                        break;
                    }
                    case 1: {
                        System.out.println(++i + "-nd second:");
                        break;
                    }
                    case (2): {
                        System.out.println(++i + "-rd second:");
                        break;
                    }
                    default: {
                        System.out.println(++i + "-th second:");
                        break;
                    }
                }
                for (Horse participant : race.getRaceParticipants()) {
                    participant.addDistance(getRandomDistancePerSecond());
                    if (participant.getDistance() > RACE_LENGTH) {
                        participant.setWinner(true);
                        System.out.println("WE HAVE THE WINNER");
                        break stop;
                    }
                }

                Horse[] participants = race.getRaceParticipants().toArray(new Horse[race.getRaceParticipants().size()]);
                Arrays.sort(participants);

                for (Horse participant : participants) {
                    System.out.println(participant.getNickName() + "(rider is " + participant.getRider().getRiderName() +
                            ") ran " + participant.getDistance() + " meters" );
                }
            }

            for (Horse participant : race.getRaceParticipants()) {
                if (participant.isWinner()) {
                    System.out.println("This race have won by the horse " + participant.getNickName() + " (rider is " + participant.getRider().getRiderName() + ")");
/*                    if (participant.isChosen()) {
                        System.out.println("Your bet won! Congratulation!!!!!");
                    } else {
                        System.out.println("You lose... :( Try again...");
                    }*/
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getRandomDistancePerSecond() {
        Random random = new Random();
        return MIN_DISTANCE_PER_SECOND + random.nextInt(MAX_DISTANCE_PER_SECOND - MIN_DISTANCE_PER_SECOND);
    }






}
