import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.scooter.praktikum.MainPage;
import ru.scooter.praktikum.OrderPage;
import static org.junit.Assert.assertEquals;


public class ScooterWebTest{

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/andrewbat/Downloads/WebDriver/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
    }

    @Test
    public void checkOrderPathHead(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickHeadOrderButton();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.inputFirstOrderPageAndGo("Мария","Багрова", "Автозаводская", "79855680808" );
        orderPage.inputSecondOrderPage("комментарий");
    }

    @Test
    public void checkOrderPathCenter(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCentralOrderButton();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.inputFirstOrderPageAndGo("Роман","Иванов", "Молодежная", "79857543896" );
        orderPage.inputSecondOrderPage("комментарий");
    }

    @Test
    public void checkQuestionsText0(){
        String EXPECTED_QUESTIONS_TEXT_0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement0();
        String actualText = mainPage.getText0();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_0, actualText);
    }

    @Test
    public void checkQuestionsText1(){
        String EXPECTED_QUESTIONS_TEXT_1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement1();
        String actualText = mainPage.getText1();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_1, actualText);
    }

    @Test
    public void checkQuestionsText2(){
        String EXPECTED_QUESTIONS_TEXT_2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement2();
        String actualText = mainPage.getText2();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_2, actualText);
    }

    @Test
    public void checkQuestionsText3(){
        String EXPECTED_QUESTIONS_TEXT_3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement3();
        String actualText = mainPage.getText3();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_3, actualText);
    }

    @Test
    public void checkQuestionsText4(){
        String EXPECTED_QUESTIONS_TEXT_4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement4();
        String actualText = mainPage.getText4();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_4, actualText);
    }

    @Test
    public void checkQuestionsText5(){
        String EXPECTED_QUESTIONS_TEXT_5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement5();
        String actualText = mainPage.getText5();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_5, actualText);
    }

    @Test
    public void checkQuestionsText6(){
        String EXPECTED_QUESTIONS_TEXT_6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement6();
        String actualText = mainPage.getText6();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_6, actualText);
    }

    @Test
    public void checkQuestionsText7(){
        String EXPECTED_QUESTIONS_TEXT_7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollDown();
        mainPage.clickElement7();
        String actualText = mainPage.getText7();
        assertEquals("Строки отличаются", EXPECTED_QUESTIONS_TEXT_7, actualText);
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

}

