import org.example.page.PracticalFormPage;
import org.junit.Test;


public class DemoqaTest extends BrowserTest {

    String url = "https://demoqa.com/automation-practice-form";

    @Test
    public void fillInForm() {
        driver.navigate().to(url);
        PracticalFormPage practicalFormPage = new PracticalFormPage(driver);
        practicalFormPage.fillInFirstName("jef");
        practicalFormPage.fillInLastName("Janssens");
        practicalFormPage.fillInEmail("janssens@gmail.com");
        practicalFormPage.fillInGender("Male");
        practicalFormPage.fillInMobile("0423343576");
        practicalFormPage.fillInCurrentAddress("Hoogstraat 7, 1930 zaventem");
        practicalFormPage.SubmitForm();
    }
}


