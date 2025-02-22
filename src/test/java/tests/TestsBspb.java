package tests;


import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;


@Tag("demode")
public class TestsBspb extends BaseTest {

    @Test
    @DisplayName("Проверка вкладок по меню при открытии главной страницы,")
    @Story("Открытие главной страницы")
    public void testMainPageOpens() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.examinationMainFindText();

    }

    @Test
    @DisplayName("Проверка перехода на страницу 'Бизнес'")
    @Story("Переход на страницу 'Бизнес'")
    public void testBusinessBankPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.navigateToBusinessPage();
        BusinessPage businessPage = new BusinessPage();
        businessPage.verifyHeaderText("Зарегистрируйте бизнес бесплатно в БСПБ");
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'Контакты'")
    @Story("Переход на страницу 'Контакты'")

    public void testContactsPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.navigateToContactsPage();
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.verifyHeaderText("Контакты для связи");
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'Офисы и банкоматы'")
    @Story("Переход на страницу 'Офисы и банкоматы'")

    public void testOfficeBankPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.navigateToOfficesAtmsPage();
        OfficesAtmsPage officesAtmsPage = new OfficesAtmsPage();
        officesAtmsPage.verifyHeaderText("Офисы и банкоматы");
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'ВЭД'")
    @Story("Переход на страницу 'ВЭД'")

    public void testVedBankPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        mainPage.navigateToForeignTradePage();
        ForeignTradePage foreignTradePage = new ForeignTradePage();
        foreignTradePage.verifyHeaderText("ВЭД любой сложности");
    }

    @Test
    @DisplayName("Проверка неудачной авторизации")
    @Story("Неудачная авторизация")

    public void testUnsuccessfulAuthorization() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.openPage();
        authorizationPage.enterCredentials("79101911212", "1234");
        authorizationPage.enterCode("1235");
        authorizationPage.verifyErrorMessage();
    }
}