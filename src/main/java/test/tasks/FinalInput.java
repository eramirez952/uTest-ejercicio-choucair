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
    public static FinalInput finalData() {
        return Tasks.instrumented(FinalInput.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("6nWP@8vZ5zzmYx6").into(UTestFinal.PASSWORD),
                Enter.theValue("6nWP@8vZ5zzmYx6").into(UTestFinal.CONFIRM_PASSWORD),
                Click.on(UTestFinal.STAY_INFORMED),
                Click.on(UTestFinal.TERMS_OF_USE),
                Click.on(UTestFinal.PRIVACY_SETTINGS),
                Click.on(UTestFinal.BUTTON)
        );
    }
}
