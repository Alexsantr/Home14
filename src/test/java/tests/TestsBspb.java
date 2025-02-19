package tests;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("demode")
public class TestsBspb extends TestSetting {



    @Test
    public void testMainPageOpens() {
        open("");
        $("body").shouldBe(visible);
    }


    @Test
    public void testBusinessBankPage() {
        Selenide.open("");
        $("a[href='/business']").click();
        $(".css-ra2taq").shouldBe(text("Зарегистрируйте бизнес бесплатно в БСПБ"));

    }

    @Test
    public void testContactsPage() {
        Selenide.open("");
        $("a[href='/feedback']").click();
        $("h1").shouldHave(text("Контакты для связи"));
    }


    @Test
    public void testOfficeBankPage() {
        Selenide.open("");
        $(byText("Офисы и банкоматы")).click();
        $(".css-1uhajv").shouldHave(text("Офисы и банкоматы"));
    }

    @Test
    public void testVedBankPage() {

        Selenide.open("");
        $("a[href='/foreign-trade']").click();
        $(".css-uyawat").shouldHave(text("ВЭД любой сложности"));
    }


}
