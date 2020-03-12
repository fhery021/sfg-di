package guru.springframework.sfgdi.dependencyinversion;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan OFF");
    }
}
