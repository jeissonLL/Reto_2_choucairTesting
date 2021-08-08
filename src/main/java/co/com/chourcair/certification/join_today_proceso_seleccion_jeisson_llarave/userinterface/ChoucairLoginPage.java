package co.com.chourcair.certification.join_today_proceso_seleccion_jeisson_llarave.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target Join_today_Button = Target.the( targetElementName, "Join today")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Join today')]"));
    public static final Target Input_FirstName = Target.the( targetElementName, "First Name")
            .located(By.id("userfirstname"));
    public static final Target Input_lastName = Target.the( targetElementName, "Last Name")
            .located(By.id("userlastname"));
    public static final Target Input_Email = Target.the( targetElementName, "Email address")
            .located(By.id("Email"));
    public static final Target Select_Date_Birth = Target.the( targetElementName, "Date of birth")
            .located(By.id("datebirth"));
    public static final Target ENTER_BUTTON = Target.the( targetElementName, "Next: location")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}

