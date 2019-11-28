package com.dang6960.pricemanager;

import android.net.Uri;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmazonItemTest {

    @Test
    public void generateListingPageLink() {
        assertNotNull(AmazonItem.generateListingPageLink("B07J2Q4SWZ"));
    }

    @Test
    public void getASIN() {
        assertEquals(AmazonItem.getASIN(Uri.parse("https://www.amazon.ca/dp/B07J2Q4SWZ")), "B07J2Q4SWZ");
    }
}