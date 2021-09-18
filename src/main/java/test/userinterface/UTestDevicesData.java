package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDevicesData {
    public static final Target OS_COMPUTER_BOX= Target.the("where do we select the operative system")
            .located(By.name("osId"));
    public static final Target OS_COMPUTER= Target.the("where do we select the operative system")
            .located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target VERSION_BOX= Target.the("where do we select the version")
            .located(By.name("osVersionId"));
    public static final Target VERSION= Target.the("where do we select the version")
            .located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final Target LANGUAGE_BOX= Target.the("where do we select the OS language")
            .located(By.name("osLanguageId"));
    public static final Target LANGUAGE= Target.the("where do we select the OS language")
            .located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target BRAND_BOX= Target.the("where do we select the Brand´s device")
            .located(By.name("handsetMakerId"));
    public static final Target BRAND= Target.the("where do we select the Brand´s device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target MODEL_BOX= Target.the("where do we select the model´s device")
            .located(By.name("handsetModelId"));
    public static final Target MODEL= Target.the("where do we select the model´s device")
            .located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target OS_DEVICE_BOX= Target.the("where do we select the model´s device")
            .located(By.name("handsetOSId"));
    public static final Target OS_DEVICE= Target.the("where do we select the model´s device")
            .located(By.xpath(
                    "//div[@name='handsetOSId']//div[contains(text(), 'Android 4.4.4')]"
            ));

    public static final Target NEXT_BUTTON = Target.the("where do we step to next page")
            .located(By.cssSelector(".btn.btn-blue")
            );
}
