/* 
ipopovich
25.09.2019
*/

package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class AnotherTest extends Extra {


    @Test
    public void startTest() {
        Selenide.open("http://google.com");
        smthAnotherTest();
    }

    @Step
    @Description("something")
    public void smthAnotherTest() {
        $(".asdas").click();

    }

    @AfterTest(alwaysRun = true)
    public void anotherTestAfter() {

        System.out.println("AnotherTest");

    }


}
