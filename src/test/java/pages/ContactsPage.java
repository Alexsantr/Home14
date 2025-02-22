package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    private SelenideElement header = $("h1");

    public void verifyHeaderText(String text) {
        header.shouldHave(text(text));
    }
}