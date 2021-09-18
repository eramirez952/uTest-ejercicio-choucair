package test.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.chrome.ChromeDriver;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import test.userinterface.UTestPage;

public class OpenUp implements Task {
    private UTestPage uTestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
