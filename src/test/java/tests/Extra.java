/* 
ipopovich
25.09.2019
*/

package tests;

import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class Extra {

    @BeforeClass(alwaysRun = true)
    public void bSuite() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
