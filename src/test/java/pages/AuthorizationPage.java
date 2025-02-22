package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {
    private SelenideElement phoneNumberField = $("#phoneNumber");
    private SelenideElement passwordField = $("#password");
    private SelenideElement loginButton = $("span.MuiTypography-button");
    private SelenideElement codeInput = $("#input-code");
    private SelenideElement confirmButton = $(byText("Подтвердить"));
    private SelenideElement errorMessage = $(byText("Неверный код"));


    public AuthorizationPage openPage() {
        open("https://pwa.bspb.ru");
        return this;
    }


    public void enterCredentials(String phone, String password) {
        phoneNumberField.setValue(phone);
        passwordField.setValue(password);
        loginButton.shouldHave(text("Продолжить")).click();
    }

    public void enterCode(String code) {
        codeInput.setValue(code);
        confirmButton.click();
    }

    public void verifyErrorMessage() {
        errorMessage.shouldBe(visible);
    }
}