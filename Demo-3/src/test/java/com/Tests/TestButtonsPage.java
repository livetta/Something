package com.Tests;

import com.User;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestButtonsPage extends SampleTest
{

    @Test
    public void AClickButtonTest()
    {
//        user.mainPage.openElementsPage();
//        user.elementsPage.openTextBox();
//        user.elementsPage.fillInTextBox();

        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenButtonsPage();
        user.buttonsPage.oneClick();

    }

    @Test
    public void BRightClickButtonTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenButtonsPage();
        user.buttonsPage.RightClick();
    }

    @Test
    public void CDoubleClickButtonTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenButtonsPage();
        user.buttonsPage.DoubleClick();
    }


}
