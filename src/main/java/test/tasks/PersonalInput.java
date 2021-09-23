package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import test.userinterface.UTestPersonalData;

public class PersonalInput implements Task {

    private String strFrstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;


    public PersonalInput(String strFrstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFrstName = strFrstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static PersonalInput personalData(String strFrstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(PersonalInput.class, strFrstName, strLastName, strEmail, strMonth, strDay, strYear);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFrstName).into(UTestPersonalData.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestPersonalData.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestPersonalData.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(strMonth).from(UTestPersonalData.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestPersonalData.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestPersonalData.SELECT_YEAR),
                Click.on(UTestPersonalData.NEXT_BUTTON)
        );
    }
}
