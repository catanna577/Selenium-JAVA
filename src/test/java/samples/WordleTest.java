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
        navigateUrl("http://localhost:3000" + "/?test=" + solution);

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

        // Verify that the pop-up window with message "Sorry, you loose" will appear

        //*[contains(text(),'Sorry, you loose!')] - message
        //*[contains(text(),'Sorry, you loose!')]/.. - pop-up window
    }

    @AfterTest
    public void scenarioEnd() {

        tearDownTest();

    }

}
