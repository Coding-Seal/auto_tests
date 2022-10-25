import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class LoginPage extends Page {

    LoginPage(String url) {
        super(url);
    }

    public LoginPage open(){
        super.open();
        return this;
    }

    public LoginPage login(String login, String password ){
        $(By.xpath("//*[@id=\"field_email\"]")).setValue(login);
        $(By.xpath("//*[@id=\"field_password\"]")).setValue(password).pressEnter();
        return this;
    }
    public LoginPage loginFailed(){
        $(By.xpath("//div[@class=\"input-e login_error\"]")).shouldHave(exactText("Incorrect username and/or password"));
        return this;
    }
    public Page loginSuccessful(){ //TODO Replace general PageClass
        $(By.xpath("//div[@class=\"input-e login_error\"]")).shouldNotBe(visible);
        return this;
    }



}
