package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class ForeignTradePage {
    private SelenideElement header = $(".css-uyawat");

    public void verifyHeaderText(String text) {
        header.shouldHave(text(text));
    }
}