package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.util.concurrent.TimeUnit;

    public class CommonMethods extends PageInitializer {

        public static WebDriver driver;

        public static void openBrowserAndLaunchApplication() {

            ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);

            switch (ConfigReader.getPropertyValue("browser")) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                default -> throw new RuntimeException("Invalid Browser name");
            }

            driver.manage().window().maximize();
            driver.get(ConfigReader.getPropertyValue("url"));
            driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

            initializePageObjects();

        }

        public static void closeBrowser() {

            driver.quit();
        }

        public static void sendText(WebElement element, String textToSend) {

            element.clear();
            element.sendKeys(textToSend);

        }


//to get webdriver wait

        public static WebDriverWait createWait() {

            WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);

            return wait;
        }

        public static void waitToBeClickable(WebElement element) {

            createWait().until(ExpectedConditions.elementToBeClickable(element));
        }

        public static void click(WebElement element) {

            waitToBeClickable(element);
            element.click();
        }

        public static void selectDropDown(WebElement element, String text) {

            Select sel = new Select(element);
            sel.selectByVisibleText(text);
        }

        public static void sendTextandEnter(WebElement element, String textToSend) {

            element.clear();
            element.sendKeys(textToSend, Keys.ENTER);

        }

        //to select date from calendar
        public static void selectDateInCalendar(String year, String month, String day) throws InterruptedException {

            selectDropDown(calendar.selectYear, year);
            Thread.sleep(2000);
            selectDropDown(calendar.selectMonth, month);
Thread.sleep(2000);
            for(WebElement date: calendar.dates) {
                if(date.getText().equals(day)) {
                    click(date);
                }
            }
        }

        //to input date in the field by hand
        public static void inputDateInCalendar(WebElement field,String year, String month, String day)  {

            sendTextandEnter(addJobDetails.joinedDateInputField, year + "-" + month + "-" + day);
            }
        }

