package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class OfficesAtmsPage {
    private SelenideElement header = $(".css-1uhajv");

    public void verifyHeaderText(String text) {
        header.shouldHave(text(text));
    }
}