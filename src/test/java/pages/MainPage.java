package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement businessLink = $("a[href='/business']");
    private SelenideElement feedbackLink = $("a[href='/feedback']");
    private SelenideElement officesAtmsLink = $(byText("Офисы и банкоматы"));
    private SelenideElement foreignTradeLink = $("a[href='/foreign-trade']");
    private ElementsCollection mainButton = $$("button.css-10s4137 p.chakra-text.css-f6gu0m");

    public void openMainPage() {
        open("");
    }

    public void navigateToBusinessPage() {
        businessLink.click();
    }

    public void navigateToContactsPage() {
        feedbackLink.click();
    }

    public void navigateToOfficesAtmsPage() {
        officesAtmsLink.click();
    }

    public void navigateToForeignTradePage() {
        foreignTradeLink.click();
    }

    public void examinationMainFindText() {
        mainButton.shouldHave(texts("Вклады", "Карты", "Кредиты", "Ипотека", "Премиум", "Пенсионерам",""));
    }


}