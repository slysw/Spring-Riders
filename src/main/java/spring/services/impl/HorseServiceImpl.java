package spring.services.impl;

import org.springframework.context.ApplicationContext;
import spring.beans.Horse;
import spring.services.HorseService;
import java.util.Map;

public class HorseServiceImpl implements HorseService {

    public HorseServiceImpl() {
    }

    @Override
    public Map<String, Horse> getHorses(ApplicationContext context) {
        return context.getBeansOfType(Horse.class);
    }
}
