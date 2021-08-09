package com.Tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTextPage extends SampleTest
{
    @Test
    public void AInputName ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenTextPage();
        user.textPage.InputUsername("Sherlok");
    }

    @Test
    public void BInputEmail ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenTextPage();
        user.textPage.InputEmail("Sherlok@example.com");
    }

    @Test
    public void CInputCurrentAddress ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenTextPage();
        user.textPage.InputCurrentAddress("Baker Street 221d");
    }

    @Test
    public void DInputPermanentAddress ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenTextPage();
        user.textPage.InputPermanentAddress("Baker Street 221d");
    }

    @Test
    public void ESubmit ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenTextPage();
        user.textPage.Submit();
    }

}
