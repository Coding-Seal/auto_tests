import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Page {
    private String url;

    Page(String url) {
        this.url = url;
    }

    public Page open() {
        Selenide.open(url);
        return this;
    }
    public Page shouldBeSamePage(){
        webdriver().shouldHave(url(this.url));
        return this;
    }

    public Page updateUrl(String url) {
        this.url = WebDriverRunner.url();
        return this;
    }
}
