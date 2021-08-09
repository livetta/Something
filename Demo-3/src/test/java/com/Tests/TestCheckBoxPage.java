package com.Tests;

import org.junit.Test;

public class TestCheckBoxPage extends SampleTest
{


    @Test
    public void AllSelectedCheckBoxTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenCheckBoxesPage();
        user.checkBoxesPage.SelectFolderHome();
    }

    @Test
    public void ExpendAllTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenCheckBoxesPage();
        user.checkBoxesPage.ExpandAll();
    }

    @Test
    public void HideAllTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenCheckBoxesPage();
        user.checkBoxesPage.HideAll();
    }

}
