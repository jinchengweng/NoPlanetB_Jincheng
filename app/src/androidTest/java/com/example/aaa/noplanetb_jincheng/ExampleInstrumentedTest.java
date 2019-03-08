package com.example.aaa.noplanetb_jincheng;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();
        etext1 = actividad.findViewById(R.id.idUser);
        etext2 = actividad.findViewById(R.id.idPasswd3);
        mloginbutton = actividad.findViewById(R.id.idBTN);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    private static final String USERNAME = "jincheng";
    private static final String PASSWORD = "123456";

    public void testLoginSignup() {
//        onView(withId(R.id.email)).perform(typeText(USERNAME));
//        onView(withId(R.id.password)).perform(typeText(PASSWORD));

        // first tap on value1 entry
        TouchUtils.tapView(this, etext1);
        getInstrumentation().sendStringSync(USERNAME);
        // now on value2 entry
        TouchUtils.tapView(this, etext2);
        getInstrumentation().sendStringSync(PASSWORD);
        // now on login button
        TouchUtils.tapView(this, mloginbutton);

    }
}