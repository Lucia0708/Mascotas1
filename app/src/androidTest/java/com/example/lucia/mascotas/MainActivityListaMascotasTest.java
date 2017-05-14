package com.example.lucia.mascotas;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityListaMascotasTest {

    @Rule
    public ActivityTestRule<MainActivityListaMascotas> mActivityTestRule = new ActivityTestRule<>(MainActivityListaMascotas.class);

    @Test
    public void mainActivityListaMascotasTest() {
    }

}
