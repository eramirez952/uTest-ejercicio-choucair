package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.userinterface.UTestDevicesData;
import test.userinterface.UTestFinal;
import test.userinterface.UTestLocationData;

public class FinalInput implements Task {

    private String strPassword;

    public FinalInput(String strPassword) {
        this.strPassword = strPassword;
    }

    public static FinalInput finalData(String strPassword) {
        return Tasks.instrumented(FinalInput.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UTestFinal.PASSWORD),
                Enter.theValue(strPassword).into(UTestFinal.CONFIRM_PASSWORD),
                Click.on(UTestFinal.STAY_INFORMED),
                Click.on(UTestFinal.TERMS_OF_USE),
                Click.on(UTestFinal.PRIVACY_SETTINGS),
                Click.on(UTestFinal.BUTTON)
        );
    }
}
