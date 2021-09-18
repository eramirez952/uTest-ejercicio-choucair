package test.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.questions.Answer;
import test.tasks.*;

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
    public void heEntersHisPersonalDataInTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PersonalInput.personalData(),
                LocationInput.addressData(),
                DevicesInput.devicesData(),
                FinalInput.finalData()
        );
    }

    @Then("^he registers on the page$")
    public void heRegistersOnThePage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
