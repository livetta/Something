package tests;

import Helper.Properties;
import org.junit.Test;

public class LoginTest extends SampleTest {

    @Test
    public void loginTest (){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // 3. Вводим почту:
        user.loginPage.fillEmailAddress(Properties.INSTANCE.getProperties("email"));
        // 4. Вводим пароль:
        user.loginPage.fillPassword(Properties.INSTANCE.getProperties("password"));
        // 5. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSignInLogin();
    }
}
