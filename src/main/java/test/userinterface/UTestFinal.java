package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFinal {
    public static final Target PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where do we write the password")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED = Target.the("where do we check the newsletter alert")
            .located(By.name("newsletterOptIn"));
    public static final Target TERMS_OF_USE = Target.the("where do we check the terms of use")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTINGS = Target.the("where do we check the privacy settings")
            .located(By.id("privacySetting"));

    public static final Target BUTTON = Target.the("where do we step to Final Page")
            .located(By.id("laddaBtn"));
}
