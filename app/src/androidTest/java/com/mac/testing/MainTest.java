package com.mac.testing;


import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.EditText;

public class MainTest extends ActivityInstrumentationTestCase2<MainActivity>
{
    public MainTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }
    public MainTest() {
        super(MainActivity.class);
    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("setUp");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("tearDown");
    }

    @SmallTest
    public void testCheck1(){
        System.out.println("testCheck1");
        EditText et = (EditText) getActivity().findViewById(R.id.editText);
        et.requestFocus();
        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("Hello world");

    }
}
