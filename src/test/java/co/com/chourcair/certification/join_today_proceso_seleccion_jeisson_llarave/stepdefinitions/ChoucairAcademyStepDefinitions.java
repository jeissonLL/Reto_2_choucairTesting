package co.com.chourcair.certification.join_today_proceso_seleccion_jeisson_llarave.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the join todat$")
    public void thanBrandonWantsToLearnAutomationAtTheChoucairAcademy (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( requiredActor,"Brandon" ).wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(academyChoucairData.get(0).getSrtFirstName(), academyChoucairData.get(0).getSrtLastName(),
                        academyChoucairData.get(0).getSrtEmail(), academyChoucairData.get(0).getSrtDateBirth())));
    }

}