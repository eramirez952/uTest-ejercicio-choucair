package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.userinterface.UTestPersonalData;

public class PersonalInput implements Task {

    public static PersonalInput personalData() {
        return Tasks.instrumented(PersonalInput.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Elkin").into(UTestPersonalData.INPUT_FIRST_NAME),
                Enter.theValue("Ramirez").into(UTestPersonalData.INPUT_LAST_NAME),
                Enter.theValue("uncorreo178@undominio.com").into(UTestPersonalData.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("January").from(UTestPersonalData.SELECT_MONTH),
                SelectFromOptions.byVisibleText("1").from(UTestPersonalData.SELECT_DAY),
                SelectFromOptions.byVisibleText("1990").from(UTestPersonalData.SELECT_YEAR),
                Click.on(UTestPersonalData.NEXT_BUTTON)
        );
    }
}
