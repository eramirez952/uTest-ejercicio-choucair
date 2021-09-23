package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestMessagePage {

    public static final Target BANNER = Target.the("Show the welcome´s message")
            .located(By.xpath(
                    "//h1[contains(text(), 'Welcome to the community of freelance software testers')]"
            )
            );

}
