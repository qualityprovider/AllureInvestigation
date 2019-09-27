/* 
ipopovich
20.09.2019
*/

package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class NewTest extends Extra {


    @Test
    public void startTest() {

        Selenide.open("http://google.com");
        smthNewTest();

    }

    @Step
    public void smthNewTest() {
        $(".asfdsfsddas").click();

    }


}
