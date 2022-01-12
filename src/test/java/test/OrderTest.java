package test;

import org.junit.jupiter.api.Test;
import page.MainPage;

public class OrderTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    public void Order() {
        mainPage.openMaingPageStep();
        mainPage.setAddSocksToCardStep();
        mainPage.setAddNecklaceToCardStep();
    }
}
