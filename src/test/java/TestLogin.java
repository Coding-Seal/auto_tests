import org.junit.jupiter.api.Test;


public class TestLogin {
    static final String login = "login";
    static final String password = "qwerty123456";

    @Test
    public void userCanLoginByUsername() {
        LoginPage loginPage = new LoginPage("https://ok.ru");
        loginPage.open().login(login, password).loginFailed();

    }

}

