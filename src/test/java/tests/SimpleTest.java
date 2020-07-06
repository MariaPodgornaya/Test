package tests;

import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class SimpleTest {

    @Managed(driver = "chrome", uniqueSession = true)
    private WebDriver driver;

    @Steps
    public User user;

    @After
    public void tearDown() {
        driver.quit();
    }


