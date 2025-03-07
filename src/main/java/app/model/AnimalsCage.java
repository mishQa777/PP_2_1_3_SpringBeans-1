package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("animalsCage")

public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
        Timer timer = new Timer();
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime().longValue());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
