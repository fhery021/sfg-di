package guru.springframework.sfgdi.dependencyinversion;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb OFF");
    }
}
