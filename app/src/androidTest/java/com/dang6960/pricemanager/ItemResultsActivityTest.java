package com.dang6960.pricemanager;

import android.content.Context;
import android.widget.FrameLayout;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;

import static org.junit.Assert.*;


public class ItemResultsActivityTest {

    @Test
    public void getDeviceModeTablet() {
        Context context = ApplicationProvider.getApplicationContext();
        FrameLayout f = new FrameLayout(context);
        assertEquals(ItemResultsActivity.getDeviceMode(f), "tablet");
    }

    @Test
    public void getDeviceModePhone() {
        assertEquals(ItemResultsActivity.getDeviceMode(null), "phone");
    }

}