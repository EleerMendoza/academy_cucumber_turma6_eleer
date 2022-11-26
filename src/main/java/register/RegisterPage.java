package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driverParametro){
        driver = driverParametro;
    }


    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String Address = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAddress = "//*[@id=\"eid\"]/input";
    private String phone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies = "//*[@id=\"checkbox2\"]";
    private String skill = "Skills";
    private String selectContry = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String selectContry1 = "//*[@id=\"select2-country-results\"]/li[7]";
    private String year = "yearbox";
    private String month = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day = "//*[@id=\"daybox\"]";

public void preencherNome(String nome){
    driver.findElement(By.xpath(firstName)).sendKeys(nome);

}
    public void preencherlasNome(String sobrenome){
        driver.findElement(By.xpath(lastName)).sendKeys(sobrenome);
    }

    public void preencherAddress(String endereco) {
        driver.findElement(By.xpath(Address)).sendKeys(endereco);
    }

            public void preencheremailAddress(String email) {
        driver.findElement(By.xpath(emailAddress)).sendKeys(email);
    }
    public void preencherphone(String telefono){
        driver.findElement(By.xpath(phone)).sendKeys(telefono);

    }
    public void preenchergender(String gender) {
        driver.findElement(By.xpath(this.gender)).click();
    }
    public void preencherhobbies(String hobbies) {
        driver.findElement(By.xpath(this.hobbies)).sendKeys("");
    }
//    public void preencherlanguages() {
//        driver.findElement(By.xpath(languages)).sendKeys("");

//    }
    public void preencherskill(String Skrill) {
        Select skils = new Select(driver.findElement(By.id(skill)));
        skils.selectByVisibleText(Skrill);
    }
    public void preencherselectContry(String selectContry) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");

        driver.findElement(By.xpath(this.selectContry)).click();
        driver.findElement(By.xpath(selectContry1)).click();
    }
    public void preencheryear(String ano) {
        Select anos = new Select(driver.findElement(By.id(year)));
        anos.selectByVisibleText(ano);
    }
    public void preenchermonth(String mayo) {
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText(mayo);
    }
    public void preencherday(String dia) {
        Select dias = new Select(driver.findElement(By.xpath(day)));
        dias.selectByVisibleText(dia);
    }

}
