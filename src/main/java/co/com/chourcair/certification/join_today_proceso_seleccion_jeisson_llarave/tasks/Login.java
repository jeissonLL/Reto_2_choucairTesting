package co.com.chourcair.certification.join_today_proceso_seleccion_jeisson_llarave.tasks;

import co.com.chourcair.certification.join_today_proceso_seleccion_jeisson_llarave.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
    private String srtFirstName;
    private String srtLastName;
    private String srtEmail;
    private String srtDateBirth;

    public Login(String srtFirstName, String srtLastName, String srtEmail, String srtDateBirth) {
        this.srtFirstName = srtFirstName;
        this.srtLastName = srtLastName;
        this.srtEmail = srtEmail;
        this.srtDateBirth = srtDateBirth;
    }

    public static Object onThePage(String srtFirstName, String srtLastName, String srtEmail, String srtDateBirth) {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.Join_today_Button),
                Enter.theValue(srtFirstName).into(ChoucairLoginPage.Input_FirstName),
                Enter.theValue((srtLastName)).into(ChoucairLoginPage.Input_lastName),
                Enter.theValue(srtEmail).into(ChoucairLoginPage.Input_Email),
                Enter.theValue((srtDateBirth)).into(ChoucairLoginPage.Select_Date_Birth),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
