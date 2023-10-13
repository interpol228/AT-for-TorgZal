import org.openqa.selenium.By;

public class OrderPage {
    By.ByXPath findString = new By.ByXPath("//*[@id=\"input-autocomplit\"]");
    By.ByXPath submitFind = new By.ByXPath("//*[@id=\"input-autocomplit-submit\"]");
    By.ByCssSelector getCheryMark = new By.ByCssSelector("[data-value='CHERY']");
    By.ByXPath getInStock = new By.ByXPath("//*[@id=\"search_head\"]/div[2]/div[2]");
    By.ByXPath doOrder = new By.ByXPath("/html/body/main/div/div[4]/div[2]/div/div/form/div[3]/button");
    By.ByXPath addToCart2ndStep = new By.ByXPath("//*[@id=\"basket-add-popup-submit\"]");
    By.ByXPath goToCart = new By.ByXPath("/html/body/header/div[2]/div/div[3]/div/div[2]/a[3]/img");
    By.ByXPath putName = new By.ByXPath("//*[@id=\"orderForm\"]/div/div[1]/div[1]/div/div/div[1]/input");
    By.ByXPath putPhone = new By.ByXPath("//*[@id=\"orderForm\"]/div/div[1]/div[1]/div/div/div[2]/input");
    By.ByXPath courierDelivery = new By.ByXPath("//*[@id=\"bx_a28af37bd142ae0d7e2e178d49544353\"]");
    By.ByXPath payByCard = new By.ByXPath("//*[@id=\"PAY_SYSTEM_4\"]");
    By.ByXPath goToPay = new By.ByXPath("//*[@id=\"orderForm\"]/div/div[1]/div[5]/div/button");

}
