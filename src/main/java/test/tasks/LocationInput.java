package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.locators.WaitForWebElementCollection;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.userinterface.UTestLocationData;
import test.userinterface.UTestPersonalData;

public class LocationInput implements Task {

    private String strCity;
    private String strZip;
    private String strCountry;

    public LocationInput(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    public static LocationInput addressData(String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(LocationInput.class, strCity, strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(strCity).into(UTestLocationData.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UTestLocationData.INPUT_CITY),
                Hit.the(Keys.TAB).into(UTestLocationData.INPUT_CITY),
                Enter.theValue(strZip).into(UTestLocationData.INPUT_ZIP_CODE),
                Click.on(UTestLocationData.COUNTRY_BOX),
                Enter.theValue(strCountry).into(UTestLocationData.COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(UTestLocationData.COUNTRY),
                Hit.the(Keys.TAB).into(UTestLocationData.COUNTRY),
                Click.on(UTestPersonalData.NEXT_BUTTON)
        );
    }
}
