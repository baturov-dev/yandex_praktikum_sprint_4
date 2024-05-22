import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.scooter.praktikum.MainPage;
import ru.scooter.praktikum.OrderPage;


@RunWith(Parameterized.class)
public class ScooterWebTestParameterized {
    private WebDriver driver;
    private final String name;
    private final String lastName;
    private final String street;
    private final String telephone;
    private final String comment;

    public ScooterWebTestParameterized(String name, String lastName, String street, String telephone, String comment){
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.telephone = telephone;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] testData(){
        return new Object[][] { {"Петр", "Сергеевич", "Авиамоторная", "89635478955", "Поскорее"},
                {"Андрей", "Викторович", "Смоленская", "89996358976", "Хочу самокат"},
                {"Евгений", "Михайлович", "Лесная", "89264856798", "000"}};
    }

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
    public void checkOrderPathHeadWithParam(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickHeadOrderButton();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.inputFirstOrderPageAndGo(name, lastName, street, telephone );
        orderPage.inputSecondOrderPage(comment);
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

}
