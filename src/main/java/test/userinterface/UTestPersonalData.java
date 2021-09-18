package test.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UTestPersonalData {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email address")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("where do we select a month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("where do we select a day")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("where do we select a year")
            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("where do we step to next page")
            .located(By.cssSelector(".btn.btn-blue")
            );

}
