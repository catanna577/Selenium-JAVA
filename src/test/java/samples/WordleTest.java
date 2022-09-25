package samples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import support.TestScope;

import static support.TestScope.*;

public class WordleTest {

    @BeforeTest
    public void scenarioStart() {

        TestScope.initialize();
        getWebDriver().manage().deleteAllCookies();

    }

    @Test         // TC - Verify that the user able loose a game
    public void looseGame() throws InterruptedException {

        // Navigate to the page and define the solution
        String solution = "apple";
        navigateUrl("http://192.168.1.61:3000" + "/?test=" + solution);
//        navigateUrl("http://localhost:3000" + "/?test=" + solution);

        // Input the 1st guess
        inputWord("fault");
        // Input the 2nd guess
        inputWord("river");
        // Input the 3rd guess
        inputWord("hobby");
        // Input the 4th guess
        inputWord("spoon");
        // Input the 5th guess
        inputWord("fruit");
        // Input the 6th guess
        inputWord("slack");

        // I wait for 3 sec
        iWaitForSec(3);

        // Verify that the pop-up window will appear
        //*[contains(text(),'Sorry, you loose!')]/.. - pop-up window
        elementWithXpathIsDisplayed("//*[contains(text(),'Sorry, you loose!')]/..");

        // Pop-up window contains the following text: "Sorry, you loose!"
        //*[contains(text(),'Sorry, you loose!')] - message
        String text = "Sorry, you loose!";
        elementWithXpathContainsText("//*[contains(text(),'Sorry, you loose!')]", text);
//        System.out.println(elementWithXpath("//*[contains(text(),'Sorry, you loose!')]").getText());

    }

    @AfterTest
    public void scenarioEnd() {

        tearDownTest();

    }

}
