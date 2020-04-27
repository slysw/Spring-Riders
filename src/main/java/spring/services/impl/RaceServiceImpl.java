package spring.services.impl;

import org.springframework.context.ApplicationContext;
import spring.beans.Horse;
import spring.beans.Race;
import spring.services.HorseService;
import spring.services.RaceService;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RaceServiceImpl implements RaceService {
    public Race getRace(ApplicationContext context) {
        HorseService horseService = (HorseService) context.getBean("horseService");
        Map<String, Horse> participants = horseService.getHorses(context);
        Race race = (Race)context.getBean("race");
        Set<Horse> raceHorses = fillRace(race, participants);
        race.setRaceParticipants(raceHorses);
        return race;
    }

    private Set<Horse> fillRace(Race race, Map<String, Horse> horses) {
        Set<Horse> participants = new HashSet<>();
        while(participants.size() < race.getNumberOfRaceParticipants()) {
            Horse horse = getRandomHorse(horses);
            participants.add(horse);
        }
        return participants;
    }

    private Horse getRandomHorse(Map<String, Horse> horses) {
        Random generator = new Random();
        Object[] values = horses.values().toArray();
        return (Horse) values[generator.nextInt(values.length)];
    }
}
