package spring.clientcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Race;
import spring.services.EmulationService;
import spring.services.RaceService;



public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        RaceService raceService = (RaceService) context.getBean("raceService");
        Race race = raceService.getRace(context);

        EmulationService emulationService = (EmulationService) context.getBean("emulationService");
        emulationService.start(race);
    }
}

