package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private static final String search = "//input[@name='text']";
    private static final String searchButton = "//button[@class='vp2']";
    private static final String addToCard = "//span[text()='Добавить в корзину']";
    private static final String goods = "//span[@class='fc8 cf9 fc9 g0c f-tsBodyL wg2']";
    private static final String gift = "//span[text()='Подарить']";
    private static final String back = "//a[text()='ozon']";

    ElementsCollection goodsCollection = $$x(goods);

    public void openMaingPageStep() {
        open("https://www.ozon.ru/");
    }

    public void setAddSocksToCardStep() {
        $x(search).setValue("Носки");
        $x(searchButton).click();
        goodsCollection.get(0).shouldBe(Condition.visible).click();
        $x(addToCard).click();
        $x(search).sendKeys(Keys.CONTROL + "a");
        $x(search).sendKeys(Keys.DELETE);
    }

    public void setAddNecklaceToCardStep() {
        $x(search).setValue("Ожерелье");
        $x(searchButton).click();
        goodsCollection.get(0).shouldBe(Condition.visible).click();
        $x(gift).click();
        switchTo().window(1).close();
    }

    public void iMFoolStep() {
        if ( int i = 0;
        i > 4;
        i++){
            
        }
    }
}
