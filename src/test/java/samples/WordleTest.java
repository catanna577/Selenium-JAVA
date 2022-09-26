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

    @Test
    // TC - Verify that the user able to lose a game
    public void test1_loseGame() throws InterruptedException {

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

        // I wait for n sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'Sorry, you loose!')]/..");

        // Pop-up window contains the following text: "Sorry, you loose!"
        String text = "Sorry, you loose!";
        elementWithXpathContainsText("//*[contains(text(),'Sorry, you loose!')]", text);

    }

    @Test
    // TC - Win the game on the N try
    public void test2_WinGameForOneGuess() throws InterruptedException {

        // Navigate to the page and define the solution
        String solution = "apple";
        navigateUrl("http://localhost:3000" + "/?test=" + solution);

        // Input the 1st guess
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "1";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @Test
    // TC - Win the game on the N try
    public void test3_WinGameForTwoGuesses() throws InterruptedException {

        // Navigate to the page and define the solution
        String solution = "apple";
        navigateUrl("http://localhost:3000" + "/?test=" + solution);

        // Input the 1st guess
        inputWord("fault");
        // Input the 2nd guess
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "2";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @Test
    // TC - Win the game on the N try
    public void test4_winGameForThreeGuesses() throws InterruptedException {

        // Navigate to the page and define the solution
        String solution = "apple";
        navigateUrl("http://localhost:3000" + "/?test=" + solution);

        // Input the 1st guess
        inputWord("fault");
        // Input the 2nd guess
        inputWord("river");
        // Input the 3rd guess
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "3";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @Test
    // TC - Win the game on the N try
    public void test5_winGameForFourGuesses() throws InterruptedException {

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
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "4";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @Test
    // TC - Win the game on the N try
    public void test6_winGameForFiveGuesses() throws InterruptedException {

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
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "5";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @Test
    // TC - Win the game on the N try
    public void test7_winGameForSixGuesses() throws InterruptedException {

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
        inputWord(solution);

        // I wait for 2 sec
        iWaitForSec(2);

        // Verify that the pop-up window will appear
        elementWithXpathIsDisplayed("//*[contains(text(),'You Win!')]/..");

        // Pop-up window contains the following text: "You win!"
        String header = "You Win!";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]", header);

        // Pop-up window contains the following text: "The word was: solution"
        elementWithXpathContainsText("//*[@class = 'solution']", solution);

        // Pop-up window contains the following text: "You found the solution in N guesses :)"
        String N = "6";
        String guesses = "in " + N + " guesses";
        elementWithXpathContainsText("//*[contains(text(),'You Win!')]/../p[2]", guesses);

    }

    @AfterTest
    public void scenarioEnd() {

        tearDownTest();

    }

}
