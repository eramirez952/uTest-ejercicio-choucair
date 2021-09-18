package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the page to login")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
