package spring.services;

import org.springframework.context.ApplicationContext;
import spring.beans.Race;

public interface RaceService {
    Race getRace(ApplicationContext context);
}
