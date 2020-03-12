package guru.springframework.sfgdi.dependencyinversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() {
        Switchable switchableBulb = new LightBulb();
        Switch bulbSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbSwitch.press();
        bulbSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(switchableFan);
        fanSwitch.press();
        fanSwitch.press();

    }

}