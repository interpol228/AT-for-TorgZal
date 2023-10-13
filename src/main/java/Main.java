import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        OrderPage orderPage = new OrderPage();
        driver.get("https://mepart.ru/personal/cart/");

        //строка поиска
        WebElement findString = driver.findElement(orderPage.findString);
        findString.click();
        findString.sendKeys("A113707110CA");

        //кнопка отправки поискового запроса
        WebElement submitFind = driver.findElement(orderPage.submitFind);
        submitFind.click();

        //кнопка c маркой Chery
        WebElement cheryMark = driver.findElement(orderPage.getCheryMark);
        WebElement cheryMarkForClick = cheryMark.findElement(new By.ByXPath("./../../.."));
        cheryMarkForClick.click();

        //нажать кнопку "Добавить в корзину"
        WebElement addToCart = driver.findElement(orderPage.getInStock);
        addToCart.click();

        //добавить в корзину
        WebElement addToCart2ndStep = driver.findElement(orderPage.addToCart2ndStep);
        addToCart2ndStep.click();

        //перейти в корзину
        WebElement goToCart = driver.findElement(orderPage.goToCart);
        goToCart.click();

        //кнопка "Сделать заказ"
        WebElement doOrder = driver.findElement(orderPage.doOrder);
        doOrder.click();

        //Ввод имени
        WebElement putName = driver.findElement(orderPage.putName);
        putName.click();
        putName.sendKeys("Anton");

        //Ввод телефона
        WebElement putPhone = driver.findElement(orderPage.putPhone);
        putPhone.click();
        putPhone.sendKeys("9999995131");

        //Доставка курьером
        WebElement courierDelivery = driver.findElement(orderPage.courierDelivery);
        courierDelivery.click();

        //Оплата картой
        WebElement payByCard = driver.findElement(orderPage.payByCard);
        payByCard.click();
        courierDelivery.click(); //TODO: второй раз кликаю на доставку курьером, т.к. не прокликивается, сходу не могу понять в чем проблема, надо дебажить

        //Переход к оплате
        WebElement goToPay = driver.findElement(orderPage.goToPay);
        goToPay.click();
    }
}
