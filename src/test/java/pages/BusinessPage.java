package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BusinessPage {
    private SelenideElement header = $(".css-ra2taq");

    public void verifyHeaderText(String text) {
        header.shouldHave(text(text));
    }
}