package spring.services;

import org.springframework.context.ApplicationContext;
import spring.beans.Horse;

import java.util.Map;

public interface HorseService {
    Map<String, Horse> getHorses(ApplicationContext context);
}
