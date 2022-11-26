package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.RegisterPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;
    @Before("@Register")

    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://demo.automationtesting.in/Register.html");
    }  
    @After("@Register")
        public void fecharBrowser() {
        driver.quit();
    }
    @AfterStep("@Register")             //Este codigo es para faxer print da tela
    public void print(){
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("Register",printStream);


    }
    @Dado("que acesso o site Register")
    public void queAcessoOSiteRegister() {
    }


    @Quando("preeencho o campo nome com valor {string} e sobrenombre com valor {string}")
    public void preeenchoOCampoNomeComValorESobrenombreComValor(String nome, String sobrenome) {
        registerPage = new RegisterPage(driver);
        registerPage.preencherNome(nome);
        registerPage.preencherlasNome(sobrenome);
    }

    @E("preeencho o campo Address com valor {string}")
    public void preeenchoOCampoAddressComValor(String Address) {

        registerPage.preencherAddress(Address);
    }

    @E("preeencho o campo emailAddress com valor {string}")
    public void preeenchoOCampoemailAddressComValor(String EmailAddress) {
        registerPage.preencheremailAddress(EmailAddress);
    }

    @E("preeencho o campo phone com valor {string}")
    public void preeenchoOCampoPhoneComValor(String phone) {
        registerPage.preencherphone(phone);
    }

    @E("clico o campo gender com valor {string}")
    public void clicoOCampoGenderComValor(String gender) {
        registerPage.preenchergender(gender);
    }

    @E("clico o campo hobbies com valor {string}")
    public void clicoOCampoHobbiesComValor(String hobbies) {
        registerPage.preencherhobbies(hobbies);
    }

    @E("seleciono o campo skill com {string}")
    public void selecionoOCampoSkillCom(String skill) {
        registerPage.preencherskill(skill);
    }

    @E("clico o campo selectContry com valor {string}")
    public void clicoOCampoSelectContryComValor(String selectContry) {
        registerPage.preencherselectContry(selectContry);
    }

    @E("seleciono o campo year com valor {string}")
    public void selecionoOCampoYearComValor(String year) {
        registerPage.preencheryear(year);
    }

    @E("seleciono o campo month com valor {string}")
    public void selecionoOCampoMonthComValor(String mont) {
        registerPage.preenchermonth(mont);
    }

    @E("seleciono o campo day com valor {string}")
    public void selecionoOCampoDayComValor(String day) {
        registerPage.preencherday(day);
    }


}
