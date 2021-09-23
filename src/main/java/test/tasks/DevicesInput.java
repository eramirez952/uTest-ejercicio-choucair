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

    private String strOS;
    private String strVersion;
    private String strLanguage;
    private String strBrand;
    private String strModel;

    public DevicesInput(String strOS, String strVersion, String strLanguage, String strBrand, String strModel) {
        this.strOS = strOS;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strBrand = strBrand;
        this.strModel = strModel;
    }

    public static DevicesInput devicesData(String strOS, String strVersion, String strLanguage, String strBrand, String strModel) {
        return Tasks.instrumented(DevicesInput.class, strOS, strVersion, strLanguage, strBrand, strModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevicesData.OS_COMPUTER_BOX),
                Enter.theValue(strOS).into(UTestDevicesData.OS_COMPUTER),
                Hit.the(Keys.TAB).into(UTestDevicesData.OS_COMPUTER),

                Click.on(UTestDevicesData.VERSION_BOX),
                Enter.theValue(strVersion).into(UTestDevicesData.VERSION),
                Hit.the(Keys.TAB).into(UTestDevicesData.VERSION),

                Click.on(UTestDevicesData.LANGUAGE_BOX),
                Enter.theValue(strLanguage).into(UTestDevicesData.LANGUAGE),
                Hit.the(Keys.TAB).into(UTestDevicesData.LANGUAGE),

                Click.on(UTestDevicesData.BRAND_BOX),
                Enter.theValue(strBrand).into(UTestDevicesData.BRAND),
                Hit.the(Keys.TAB).into(UTestDevicesData.BRAND),

                Click.on(UTestDevicesData.MODEL_BOX),
                Enter.theValue(strModel).into(UTestDevicesData.MODEL),
                Hit.the(Keys.TAB).into(UTestDevicesData.MODEL),

                Click.on(UTestDevicesData.OS_DEVICE_BOX),
                Click.on(UTestDevicesData.OS_DEVICE),

                Click.on(UTestDevicesData.NEXT_BUTTON)
        );
    }
}
