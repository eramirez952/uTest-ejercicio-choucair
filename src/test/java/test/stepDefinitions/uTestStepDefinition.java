package test.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.model.UTestData;
import test.questions.Answer;
import test.tasks.*;

import java.util.List;

public class uTestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to be part of the community of testers$")
    public void thanJuanWantsToBePartOfTheCommunityOfTesters() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (SingUp.onThePage()));
    }

    @When("^he enters his personal data in the form$")
    public void heEntersHisPersonalDataInTheForm(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PersonalInput.personalData(
                    uTestData.get(0).getStrFrstName(),
                    uTestData.get(0).getStrLastName(),
                    uTestData.get(0).getStrEmail(),
                    uTestData.get(0).getStrMonth(),
                    uTestData.get(0).getStrDay(),
                    uTestData.get(0).getStrYear()
                ),
                LocationInput.addressData(
                        uTestData.get(0).getStrCity(),
                        uTestData.get(0).getStrZip(),
                        uTestData.get(0).getStrCountry()
                ),
                DevicesInput.devicesData(
                        uTestData.get(0).getStrOS(),
                        uTestData.get(0).getStrVersion(),
                        uTestData.get(0).getStrLanguage(),
                        uTestData.get(0).getStrBrand(),
                        uTestData.get(0).getStrModel()
                ),
                FinalInput.finalData(
                        uTestData.get(0).getStrPassword()
                )
        );
    }

    @Then("^he registers on the page$")
    public void heRegistersOnThePage(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrBanner())));
    }

}
