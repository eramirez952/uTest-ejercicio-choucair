package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import test.userinterface.UTestDevicesData;
import test.userinterface.UTestLocationData;

public class DevicesInput implements Task {
    public static DevicesInput devicesData() {
        return Tasks.instrumented(DevicesInput.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevicesData.OS_COMPUTER_BOX),
                Enter.theValue("Windows").into(UTestDevicesData.OS_COMPUTER),
                Hit.the(Keys.TAB).into(UTestDevicesData.OS_COMPUTER),

                Click.on(UTestDevicesData.VERSION_BOX),
                Enter.theValue("10").into(UTestDevicesData.VERSION),
                Hit.the(Keys.TAB).into(UTestDevicesData.VERSION),

                Click.on(UTestDevicesData.LANGUAGE_BOX),
                Enter.theValue("Spanish").into(UTestDevicesData.LANGUAGE),
                Hit.the(Keys.TAB).into(UTestDevicesData.LANGUAGE),

                Click.on(UTestDevicesData.BRAND_BOX),
                Enter.theValue("Xiaomi").into(UTestDevicesData.BRAND),
                Hit.the(Keys.TAB).into(UTestDevicesData.BRAND),

                Click.on(UTestDevicesData.MODEL_BOX),
                Enter.theValue("Redmi 2").into(UTestDevicesData.MODEL),
                Hit.the(Keys.TAB).into(UTestDevicesData.MODEL),

                Click.on(UTestDevicesData.OS_DEVICE_BOX),
                Click.on(UTestDevicesData.OS_DEVICE),

                Click.on(UTestDevicesData.NEXT_BUTTON)
        );
    }
}
