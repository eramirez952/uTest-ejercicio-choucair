package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLocationData {

    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the zip code")
            .located(By.id("zip"));

    public static final Target COUNTRY_BOX = Target.the("where do we view the country")
            .located(By.name("countryId"));

    public static final Target COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//input[@placeholder='Select a country']"));

    public static final Target NEXT_BUTTON = Target.the("where do we step to next page")
            .located(By.cssSelector(".btn.btn-blue")
            );


}
