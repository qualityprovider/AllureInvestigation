/* 
ipopovich
25.09.2019
*/

package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class YetAnotherTest extends Extra {

    @Test
    public void startTest() {
        Selenide.open("http://google.com");
        smthYetAnotherTest();
    }

    @Step
    public void smthYetAnotherTest() {
        $(".sadasdasdasds").click();

    }


}
